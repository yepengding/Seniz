package org.veritasopher.seniz;

import org.junit.Test;
import org.veritasopher.seniz.config.Info;
import org.veritasopher.seniz.controller.MasterController;
import org.veritasopher.seniz.core.model.GlobalEnvironment;
import org.veritasopher.seniz.core.model.SourceFile;
import org.veritasopher.seniz.generator.dot.DOTGenerator;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.veritasopher.seniz.util.PathUtil.getFilePathInResource;

/**
 * Function Test
 * Test system functionality
 *
 * @author Yepeng Ding
 * @date 12/17/2020
 */
public class FunctionTest {

    @Test
    public void testMultiFileCompileByPaths() {
        String path = getFilePathInResource("example/MultiSys");
        File folder = new File(path);
        FilenameFilter filter = (f, name) -> name.endsWith(Info.SUFFIX);
        File[] files = folder.listFiles(filter);
        assertNotNull(files);
        Set<String> sourceFilePaths = Arrays.stream(files).parallel().map(File::getAbsolutePath).collect(Collectors.toSet());
        assertEquals(6, sourceFilePaths.size());

        MasterController masterController = new MasterController();
        GlobalEnvironment env = masterController.compile(sourceFilePaths);

        DOTGenerator dotGenerator = new DOTGenerator(env, env.getMainTS());
        dotGenerator.generateToConsole();

    }

    @Test
    public void testMultiFileCompileBySourceFiles() {
        String path = getFilePathInResource("example/MultiSys");
        File folder = new File(path);
        FilenameFilter filter = (f, name) -> name.endsWith(Info.SUFFIX);
        File[] files = folder.listFiles(filter);
        assertNotNull(files);

        List<SourceFile> sourceFiles = Arrays.stream(files).map(file -> {
            try {
                return new SourceFile(file.getAbsolutePath(), Files.readString(Path.of(file.getAbsolutePath())));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }).collect(Collectors.toList());
        assertEquals(6, sourceFiles.size());

        MasterController masterController = new MasterController();
        GlobalEnvironment env = masterController.compile(sourceFiles);

        DOTGenerator dotGenerator = new DOTGenerator(env, env.getMainTS());
        dotGenerator.generateToConsole();

    }

    @Test
    public void testDPP() {
        String path = getFilePathInResource("example/DPP");
        File folder = new File(path);
        FilenameFilter filter = (f, name) -> name.endsWith(Info.SUFFIX);
        File[] files = folder.listFiles(filter);
        assertNotNull(files);
        Set<String> sourceFilePaths = Arrays.stream(files).parallel().map(File::getAbsolutePath).collect(Collectors.toSet());

        MasterController masterController = new MasterController();
        GlobalEnvironment env = masterController.compile(sourceFilePaths);

        DOTGenerator dotGenerator = new DOTGenerator(env, env.getMainTS());
        dotGenerator.generateToConsole();

    }

    @Test
    public void testSingleFileCompile() {
        String path = getFilePathInResource("example/TestSys.sz");
        Set<String> sourceFilePaths = new HashSet<>();
        sourceFilePaths.add(path);

        MasterController masterController = new MasterController();
        GlobalEnvironment env = masterController.compile(sourceFilePaths);
        DOTGenerator dotGenerator = new DOTGenerator(env, env.getMainTS());
        dotGenerator.generateToConsole();

    }

}
