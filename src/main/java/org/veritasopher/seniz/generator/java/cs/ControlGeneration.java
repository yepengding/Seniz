package org.veritasopher.seniz.generator.java.cs;

import lombok.AllArgsConstructor;
import org.veritasopher.seniz.core.model.ControlSystem;

import java.nio.file.Path;
import java.util.stream.Collectors;

import static org.veritasopher.seniz.generator.java.dict.SourceFile.GLOBAL_VARIABLE;
import static org.veritasopher.seniz.generator.java.util.Template.generateGlobalVariableFromTemplate;
import static org.veritasopher.seniz.generator.java.util.Transform.toJavaTypeClass;
import static org.veritasopher.seniz.generator.java.util.Transform.toJavaVariableName;
import static org.veritasopher.seniz.util.FileUtil.writeToFile;

/**
 * Control Files Generation
 *
 * @author Yepeng Ding
 * @date 4/10/2022
 */
@AllArgsConstructor
public class ControlGeneration {

    private ControlSystem cs;

    private String rootNamespace;

    private Path root;

    /**
     * Generate GlobalVariable
     */
    public void generateGlobalVariable() {
        // State variables of a control system are global state variables of its transition systems.
        String globalVariables = cs.getStateVariables().getVariableSet().stream()
                .map(v -> "%s(\"%s\", %s)"
                        .formatted(toJavaVariableName(v.getName()),
                                v.getName(),
                                toJavaTypeClass(v.getPrimaryType())))
                .collect(Collectors.joining("," + System.lineSeparator()));

        String globalVariableProgram = generateGlobalVariableFromTemplate(GLOBAL_VARIABLE.getNamespace(rootNamespace), globalVariables);

        writeToFile(globalVariableProgram, GLOBAL_VARIABLE.getFilePath(root));
    }

}
