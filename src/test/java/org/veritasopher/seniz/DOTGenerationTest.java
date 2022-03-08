package org.veritasopher.seniz;

import org.junit.Test;
import org.veritasopher.seniz.controller.MasterController;
import org.veritasopher.seniz.core.model.GlobalEnvironment;
import org.veritasopher.seniz.generator.dot.DOTGenerator;

import java.util.HashSet;
import java.util.Set;

import static org.veritasopher.seniz.util.PathUtil.getFilePathInResource;

/**
 * DOT Generation Test
 *
 * @author Yepeng Ding
 * @date 3/4/2022
 */
public class DOTGenerationTest {

    @Test
    public void testTestSys() {
        String path = getFilePathInResource("example/TestSys.sz");
        Set<String> sourceFilePaths = new HashSet<>();
        sourceFilePaths.add(path);

        MasterController masterController = new MasterController();
        GlobalEnvironment env = masterController.compile(sourceFilePaths);
        DOTGenerator dotGenerator = new DOTGenerator(env, env.getMainTS());
        dotGenerator.generateToConsole();
    }

    @Test
    public void testSimple3() {
        String path = getFilePathInResource("example/Simple3.sz");
        Set<String> sourceFilePaths = new HashSet<>();
        sourceFilePaths.add(path);

        MasterController masterController = new MasterController();
        GlobalEnvironment env = masterController.compile(sourceFilePaths);
        DOTGenerator dotGenerator = new DOTGenerator(env, env.getMainTS());
        dotGenerator.generateToConsole();
    }

    @Test
    public void testTransaction() {
        String path = getFilePathInResource("example/Transaction.sz");
        Set<String> sourceFilePaths = new HashSet<>();
        sourceFilePaths.add(path);

        MasterController masterController = new MasterController();
        GlobalEnvironment env = masterController.compile(sourceFilePaths);
        DOTGenerator dotGenerator = new DOTGenerator(env, env.getMainTS());
        dotGenerator.generateToConsole();
    }
}
