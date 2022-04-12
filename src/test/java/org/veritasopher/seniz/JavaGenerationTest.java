package org.veritasopher.seniz;

import org.junit.Test;
import org.veritasopher.seniz.config.Info;
import org.veritasopher.seniz.controller.MasterController;
import org.veritasopher.seniz.core.model.GlobalEnvironment;
import org.veritasopher.seniz.generator.java.JavaGenerator;
import org.veritasopher.seniz.util.FileUtil;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.Assert.assertNotNull;
import static org.veritasopher.seniz.util.FileUtil.getFilePathInResource;

/**
 * Java Generation Test
 *
 * @author Yepeng Ding
 * @date 3/7/2022
 */
public class JavaGenerationTest {

    @Test
    public void testSimple0() {
        String path = getFilePathInResource("example/Simple0.sz");
        Set<String> sourceFilePaths = new HashSet<>();
        sourceFilePaths.add(path);

        MasterController masterController = new MasterController();
        GlobalEnvironment env = masterController.compile(sourceFilePaths);

        JavaGenerator javaGenerator = new JavaGenerator(env);
        javaGenerator.generateToDir("org.veritasopher.seniz.generation", "src/test/java/org/veritasopher/seniz/generation");
    }

    @Test
    public void testSemaphore() {
        String path = getFilePathInResource("example/Semaphore");
        File folder = new File(path);
        FilenameFilter filter = (f, name) -> name.endsWith(Info.SUFFIX);
        File[] files = folder.listFiles(filter);
        assertNotNull(files);
        Set<String> sourceFilePaths = Arrays.stream(files).parallel().map(File::getAbsolutePath).collect(Collectors.toSet());

        MasterController masterController = new MasterController();
        GlobalEnvironment env = masterController.compile(sourceFilePaths);

        JavaGenerator javaGenerator = new JavaGenerator(env);
        javaGenerator.generateToDir("org.veritasopher.seniz.generation", "src/test/java/org/veritasopher/seniz/generation");
    }

}
