package org.veritasopher.seniz;

import org.junit.Test;
import org.veritasopher.seniz.config.Info;
import org.veritasopher.seniz.controller.MasterController;
import org.veritasopher.seniz.core.model.GlobalEnvironment;
import org.veritasopher.seniz.generator.dot.DOTGenerator;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.Assert.assertNotNull;
import static org.veritasopher.seniz.util.PathUtil.getFilePathInResource;

/**
 * DOT Generation Test
 *
 * @author Yepeng Ding
 * @date 3/4/2022
 */
public class DOTGenerationTest {

    @Test
    public void testSimple0() {
        String path = getFilePathInResource("example/Simple0.sz");
        Set<String> sourceFilePaths = new HashSet<>();
        sourceFilePaths.add(path);

        MasterController masterController = new MasterController();
        GlobalEnvironment env = masterController.compile(sourceFilePaths);
        DOTGenerator dotGenerator = new DOTGenerator(env);
        dotGenerator.generateToConsole();
    }

    @Test
    public void testSimple1() {
        String path = getFilePathInResource("example/Simple1.sz");
        Set<String> sourceFilePaths = new HashSet<>();
        sourceFilePaths.add(path);

        MasterController masterController = new MasterController();
        GlobalEnvironment env = masterController.compile(sourceFilePaths);
        DOTGenerator dotGenerator = new DOTGenerator(env);
        dotGenerator.generateToConsole();
    }

    @Test
    public void testSimple2() {
        String path = getFilePathInResource("example/Simple2.sz");
        Set<String> sourceFilePaths = new HashSet<>();
        sourceFilePaths.add(path);

        MasterController masterController = new MasterController();
        GlobalEnvironment env = masterController.compile(sourceFilePaths);
        DOTGenerator dotGenerator = new DOTGenerator(env);
        dotGenerator.generateToConsole();
    }

    @Test
    public void testSimple3() {
        String path = getFilePathInResource("example/Simple3.sz");
        Set<String> sourceFilePaths = new HashSet<>();
        sourceFilePaths.add(path);

        MasterController masterController = new MasterController();
        GlobalEnvironment env = masterController.compile(sourceFilePaths);
        DOTGenerator dotGenerator = new DOTGenerator(env);
        dotGenerator.generateToConsole();
    }

    @Test
    public void testTransaction() {
        String path = getFilePathInResource("example/TransactionClient.sz");
        Set<String> sourceFilePaths = new HashSet<>();
        sourceFilePaths.add(path);

        MasterController masterController = new MasterController();
        GlobalEnvironment env = masterController.compile(sourceFilePaths);
        DOTGenerator dotGenerator = new DOTGenerator(env);
        dotGenerator.generateToConsole();
    }

    @Test
    public void testMultiSys() {
        String path = getFilePathInResource("example/MultiSys");
        File folder = new File(path);
        FilenameFilter filter = (f, name) -> name.endsWith(Info.SUFFIX);
        File[] files = folder.listFiles(filter);
        assertNotNull(files);
        Set<String> sourceFilePaths = Arrays.stream(files).parallel().map(File::getAbsolutePath).collect(Collectors.toSet());

        MasterController masterController = new MasterController();
        GlobalEnvironment env = masterController.compile(sourceFilePaths);

        DOTGenerator dotGenerator = new DOTGenerator(env);
        dotGenerator.generateToConsole();
    }

    @Test
    public void testSemaphoreBySourceFiles() {
        String path = getFilePathInResource("example/Semaphore");
        File folder = new File(path);
        FilenameFilter filter = (f, name) -> name.endsWith(Info.SUFFIX);
        File[] files = folder.listFiles(filter);
        assertNotNull(files);
        Set<String> sourceFilePaths = Arrays.stream(files).parallel().map(File::getAbsolutePath).collect(Collectors.toSet());

        MasterController masterController = new MasterController();
        GlobalEnvironment env = masterController.compile(sourceFilePaths);

        DOTGenerator dotGenerator = new DOTGenerator(env);
        dotGenerator.generateToConsole();

    }

    @Test
    public void testDPPBySourceFiles() {
        String path = getFilePathInResource("example/DPP");
        File folder = new File(path);
        FilenameFilter filter = (f, name) -> name.endsWith(Info.SUFFIX);
        File[] files = folder.listFiles(filter);
        assertNotNull(files);
        Set<String> sourceFilePaths = Arrays.stream(files).parallel().map(File::getAbsolutePath).collect(Collectors.toSet());

        MasterController masterController = new MasterController();
        GlobalEnvironment env = masterController.compile(sourceFilePaths);

        DOTGenerator dotGenerator = new DOTGenerator(env);
        dotGenerator.generateToConsole();

    }
}
