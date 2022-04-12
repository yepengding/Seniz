package org.veritasopher.seniz;

import org.junit.Test;

/**
 * Application Test
 *
 * @author Yepeng Ding
 * @date 12/2/2020
 */
public class AppTest {

    @Test
    public void testEmptyArg() {
        String[] args = {};
        App.main(args);
    }

    @Test
    public void testVersion() {
        String[] args = {"-v"};
        App.main(args);
    }

    @Test
    public void testHelp() {
        String[] args = {"-h"};
        App.main(args);
    }

    @Test
    public void testGenerationFromSourceFile() {
        String[] args = {"-n", "org.veritasopher.seniz.generation", "-o", "src/test/java/org/veritasopher/seniz/generation", "src/main/resources/example/Simple0.sz"};
        App.main(args);
    }

    @Test
    public void testGenerationFromSourceDir() {
        String[] args = {"-n", "org.veritasopher.seniz.generation", "-o", "src/test/java/org/veritasopher/seniz/generation", "src/main/resources/example/Semaphore"};
        App.main(args);
    }
}
