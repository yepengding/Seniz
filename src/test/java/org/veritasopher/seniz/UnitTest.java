package org.veritasopher.seniz;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Before;
import org.junit.Test;
import org.veritasopher.seniz.controller.CompileController;
import org.veritasopher.seniz.core.base.SenizLexer;
import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.generator.DOTGenerator;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import static org.junit.Assert.assertNotNull;

/**
 * Unit Test
 *
 * @author Yepeng Ding
 * @date 12/2/2020
 */
public class UnitTest {

    private TransitionSystem testTS;

    @Before
    public void setUp() {
        String path = resourcePath("example/Transaction.sz");
        Set<String> sourceFilePaths = new HashSet<>();
        sourceFilePaths.add(path);

        CompileController compileController = new CompileController();
        compileController.compile(sourceFilePaths);
        testTS = compileController.getTransitionSystems().iterator().next();
    }

    @Test
    public void testGenerateDOTString() throws IOException {
        String path = resourcePath("example/TestTS.sz");
        File file = new File(path);
        String sourceFileContent = Files.toString(file, Charsets.UTF_8);
        CompileController compileController = new CompileController();
        TransitionSystem ts = compileController.compile(sourceFileContent);
        if (ts != null) {
            DOTGenerator dotGenerator = new DOTGenerator(ts);
            String dotProgram = dotGenerator.generateAsString();
            System.out.println(dotProgram);
        }
    }

    @Test
    public void testDOTGenerator() {
        DOTGenerator dotGenerator = new DOTGenerator(testTS);
        dotGenerator.generateToConsole();
    }

    @Test
    public void testCompilationController() {
        String path = resourcePath("example/Transaction.sz");
        Set<String> sourceFilePaths = new HashSet<>();
        sourceFilePaths.add(path);

        CompileController compileController = new CompileController();
        compileController.compile(sourceFilePaths);

        compileController.getTransitionSystems().forEach(ts -> {
            System.out.println(ts.getTransitions());
        });
    }

    private String resourcePath(String filePath) {
        return Objects.requireNonNull(Thread.currentThread().getContextClassLoader().getResource(filePath)).getPath();
    }

    private ParseTree getParserTreeFromFile(String resourcePath) {
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(resourcePath);
        assertNotNull(inputStream);

        SenizParser parser = null;

        try {
            SenizLexer lexer = new SenizLexer(CharStreams.fromStream(inputStream));
            parser = new SenizParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertNotNull(parser);
        return parser.compilationUnit();
    }

}
