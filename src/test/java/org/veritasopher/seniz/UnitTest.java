package org.veritasopher.seniz;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;
import org.veritasopher.seniz.core.base.SenizLexer;
import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.model.TransitionSystem;
import org.veritasopher.seniz.core.visitor.StateDeclarationVisitor;
import org.veritasopher.seniz.core.visitor.TransitionVisitor;
import org.veritasopher.seniz.core.visitor.VariableVisitor;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertNotNull;

/**
 * Unit Test
 *
 * @author Yepeng Ding
 * @date 12/2/2020
 */
public class UnitTest {

    @Test
    public void testTransitionVisitor() {
        ParseTree tree = getParserTreeFromFile("example/Simple1.sz");
        TransitionSystem transitionSystem = new TransitionSystem();

        VariableVisitor variableVisitor = new VariableVisitor(transitionSystem);
        variableVisitor.visit(tree);

        StateDeclarationVisitor stateDeclarationVisitor = new StateDeclarationVisitor(transitionSystem);
        stateDeclarationVisitor.visit(tree);

        TransitionVisitor transitionVisitor = new TransitionVisitor(transitionSystem);
        transitionVisitor.visit(tree);

        transitionSystem.getTransitions().forEach((name, transition) -> {
            System.out.println(transition);
        });
    }

    @Test
    public void testStateDeclarationVisitor() {
        ParseTree tree = getParserTreeFromFile("example/Simple1.sz");
        TransitionSystem transitionSystem = new TransitionSystem();

        VariableVisitor variableVisitor = new VariableVisitor(transitionSystem);
        variableVisitor.visit(tree);

        StateDeclarationVisitor stateDeclarationVisitor = new StateDeclarationVisitor(transitionSystem);
        stateDeclarationVisitor.visit(tree);

        transitionSystem.getStates().forEach((name, state) -> {
            System.out.println(state);
        });
    }

    @Test
    public void testVariableVisitor() {
        ParseTree tree = getParserTreeFromFile("example/Vars.sz");
        TransitionSystem transitionSystem = new TransitionSystem();

        VariableVisitor variableVisitor = new VariableVisitor(transitionSystem);
        variableVisitor.visit(tree);

        transitionSystem.getVariables().values().forEach(System.out::println);
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
