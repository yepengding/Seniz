package org.veritasopher.seniz;

import org.junit.Test;
import org.veritasopher.seniz.controller.MasterController;
import org.veritasopher.seniz.core.model.GlobalEnvironment;
import org.veritasopher.seniz.generator.java.JavaGenerator;
import org.veritasopher.seniz.util.PathUtil;

import java.util.HashSet;
import java.util.Set;

/**
 * Java Generation Test
 *
 * @author Yepeng Ding
 * @date 3/7/2022
 */
public class JavaGenerationTest {

    @Test
    public void testSimple0() {
        String path = PathUtil.getFilePathInResource("example/Simple0.sz");
        Set<String> sourceFilePaths = new HashSet<>();
        sourceFilePaths.add(path);

        MasterController masterController = new MasterController();
        GlobalEnvironment env = masterController.compile(sourceFilePaths);
        JavaGenerator javaGenerator = new JavaGenerator(env);

        javaGenerator.generateToDir("org.veritasopher.seniz.generation", "src/test/java/org/veritasopher/seniz/generation");
    }

}
