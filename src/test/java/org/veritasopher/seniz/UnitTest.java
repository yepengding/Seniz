package org.veritasopher.seniz;

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

        CompileController compileController = new CompileController(sourceFilePaths);
        compileController.compile();
        testTS = compileController.getTransitionSystems().iterator().next();
    }

    @Test
    public void testDOTGenerator() {
        DOTGenerator dotGenerator = new DOTGenerator(testTS);
        dotGenerator.generate();
    }

    @Test
    public void testCompilationController() {
        String path = resourcePath("example/Transaction.sz");
        Set<String> sourceFilePaths = new HashSet<>();
        sourceFilePaths.add(path);

        CompileController compileController = new CompileController(sourceFilePaths);
        compileController.compile();

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
