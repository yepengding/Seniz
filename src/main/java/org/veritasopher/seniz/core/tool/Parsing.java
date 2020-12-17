package org.veritasopher.seniz.core.tool;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.veritasopher.seniz.core.base.SenizLexer;
import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.exception.ThrowingErrorListener;

public class Parsing {

    public static ParseTree getParseTreeFromSource(CharStream source) {
        SenizLexer lexer = new SenizLexer(source);
        lexer.removeErrorListeners();
        lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
        SenizParser parser = new SenizParser(new CommonTokenStream(lexer));
        parser.removeErrorListeners();
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);
        parser.setBuildParseTree(true);
        return parser.compilationUnit();
    }

}
