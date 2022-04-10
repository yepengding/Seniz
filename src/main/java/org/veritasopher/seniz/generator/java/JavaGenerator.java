package org.veritasopher.seniz.generator.java;

import org.veritasopher.seniz.core.model.ControlSystem;
import org.veritasopher.seniz.core.model.GlobalEnvironment;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.exception.type.GeneratorException;
import org.veritasopher.seniz.generator.base.BaseGenerator;

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
            generateTSToDir(env.getTransitionSystem(systemIdentifier).get(), namespace, outDir);
        } else if (env.getControlSystem(systemIdentifier).isPresent()) {
            generateCSToDir(env.getControlSystem(systemIdentifier).get(), namespace, outDir);
        } else {
            throw new GeneratorException(systemIdentifier, "Unknown system is found.");
        }
    }

    private void generateTSToDir(TransitionSystem ts, String namespace, String outDir) {
        Path root = Path.of(outDir + File.separator + ts.getIdentifier().toLowerCase());
        String rootNamespace = "%s.%s".formatted(namespace, ts.getIdentifier().toLowerCase());

        CoreGeneration coreGeneration = new CoreGeneration(ts, rootNamespace, root);
        coreGeneration.generate();

        BaseGeneration baseGeneration = new BaseGeneration(rootNamespace, root);
        baseGeneration.generate();

        ExecutorGeneration executorGeneration = new ExecutorGeneration(ts, rootNamespace, root);
        executorGeneration.generate();

    }

    private void generateCSToDir(ControlSystem cs, String namespace, String outDir) {
        Path root = Path.of(outDir + File.separator + cs.getIdentifier().toLowerCase());
        String rootNamespace = "%s.%s".formatted(namespace, cs.getIdentifier().toLowerCase());

        cs.getControlStatement().getSystemIdentifiers().forEach(
                id -> generateTSToDir(env.getTransitionSystem(id).orElseThrow(() ->
                                new GeneratorException("Undefined transition system.")),
                        rootNamespace,
                        root.toString())
        );

    }

}
