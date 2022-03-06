package org.veritasopher.seniz;

import org.junit.Test;
import org.veritasopher.seniz.controller.MasterController;
import org.veritasopher.seniz.core.model.GlobalEnvironment;
import org.veritasopher.seniz.generator.DOTGenerator;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * DOT Generation Test
 *
 * @author Yepeng Ding
 * @date 3/4/2022
 */
public class DOTGenerationTest {

    @Test
    public void testSimple3() {
        String path = resourcePath("example/Simple3.sz");
        Set<String> sourceFilePaths = new HashSet<>();
        sourceFilePaths.add(path);

        MasterController masterController = new MasterController();
        GlobalEnvironment env = masterController.compile(sourceFilePaths);
        DOTGenerator dotGenerator = new DOTGenerator(env, env.getMainTS());
        dotGenerator.generateToConsole();
    }

    @Test
    public void testTransaction() {
        String path = resourcePath("example/Transaction.sz");
        Set<String> sourceFilePaths = new HashSet<>();
        sourceFilePaths.add(path);

        MasterController masterController = new MasterController();
        GlobalEnvironment env = masterController.compile(sourceFilePaths);
        DOTGenerator dotGenerator = new DOTGenerator(env, env.getMainTS());
        dotGenerator.generateToConsole();

    }

    private String resourcePath(String filePath) {
        return Objects.requireNonNull(Thread.currentThread().getContextClassLoader().getResource(filePath)).getPath();
    }
}
