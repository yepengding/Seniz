package org.veritasopher.seniz.generator.java;

import org.veritasopher.seniz.core.model.ControlSystem;
import org.veritasopher.seniz.core.model.GlobalEnvironment;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.exception.type.GeneratorException;
import org.veritasopher.seniz.generator.base.BaseGenerator;
import org.veritasopher.seniz.generator.java.cs.ControlGeneration;
import org.veritasopher.seniz.generator.java.ts.BaseGeneration;
import org.veritasopher.seniz.generator.java.ts.CoreGeneration;
import org.veritasopher.seniz.generator.java.ts.ExecutorGeneration;
import org.veritasopher.seniz.generator.java.ts.SDKGeneration;

import java.io.File;
import java.nio.file.Path;

/**
 * Java Generator
 *
 * @author Yepeng Ding
 * @date 3/7/2022
 */
public class JavaGenerator extends BaseGenerator {

    public JavaGenerator(GlobalEnvironment globalEnvironment) {
        super(globalEnvironment);
    }

    public JavaGenerator(GlobalEnvironment globalEnvironment, String systemIdentifier) {
        super(globalEnvironment, systemIdentifier);
    }

    /**
     * Generate program to a given directory
     *
     * @param outDir output directory
     */
    public void generateToDir(String namespace, String outDir) {
        if (env.getTransitionSystem(systemIdentifier).isPresent()) {
            // Main system is a transition system
            generateTSToDir(env.getTransitionSystem(systemIdentifier).get(), namespace, false, outDir);
        } else if (env.getControlSystem(systemIdentifier).isPresent()) {
            // Main system is a control system
            generateCSToDir(env.getControlSystem(systemIdentifier).get(), namespace, outDir);
        } else {
            throw new GeneratorException(systemIdentifier, "Unknown system is found.");
        }
    }

    /**
     * Generate transition system program to a directory
     *
     * @param ts        transition system
     * @param namespace namespace
     * @param isGlobal  if the namespace is a global namespace
     * @param outDir    output directory
     */
    private void generateTSToDir(TransitionSystem ts, String namespace, boolean isGlobal, String outDir) {
        Path root = Path.of(outDir + File.separator + ts.getIdentifier().toLowerCase());
        String rootNamespace = "%s.%s".formatted(namespace, ts.getIdentifier().toLowerCase());
        // If not a global namespace, then use the root namespace
        String globalNamespace = isGlobal ? namespace : rootNamespace;

        CoreGeneration coreGeneration = new CoreGeneration(ts, globalNamespace, rootNamespace, root);
        coreGeneration.generate();

        BaseGeneration baseGeneration = new BaseGeneration(globalNamespace, rootNamespace, root);
        baseGeneration.generate();

        ExecutorGeneration executorGeneration = new ExecutorGeneration(ts, globalNamespace, rootNamespace, root);
        executorGeneration.generate();

        SDKGeneration sdkGeneration = new SDKGeneration(globalNamespace, rootNamespace, root);
        sdkGeneration.generate();

    }

    private void generateCSToDir(ControlSystem cs, String namespace, String outDir) {
        Path root = Path.of(outDir + File.separator + cs.getIdentifier().toLowerCase());
        String rootNamespace = "%s.%s".formatted(namespace, cs.getIdentifier().toLowerCase());

        ControlGeneration controlGeneration = new ControlGeneration(env, cs, rootNamespace, root);
        controlGeneration.generate();

        cs.getControlStatement().getSubsystemIdentifierList().forEach(
                id -> generateTSToDir(env.getTransitionSystem(id).orElseThrow(() ->
                                new GeneratorException("Undefined transition system.")),
                        rootNamespace,
                        true,
                        root.toString())
        );

    }

}
