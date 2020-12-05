package org.veritasopher.seniz.controller;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.veritasopher.seniz.core.base.SenizLexer;
import org.veritasopher.seniz.core.base.SenizParser;
import org.veritasopher.seniz.core.model.TransitionSystem;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * System Controller
 *
 * @author Yepeng Ding
 * @date 12/4/2020
 */
public class SystemController {

    private final String sourceFilePath;

    private TransitionSystem transitionSystem;

    public SystemController(String sourceFilePath, String specName) {
        this.sourceFilePath = sourceFilePath;
    }

    public void run() {
        try {
            // Parse file
            SenizLexer lexer = new SenizLexer(CharStreams.fromStream(new FileInputStream(this.sourceFilePath)));
            SenizParser parser = new SenizParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);

            this.transitionSystem = new TransitionSystem();

        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }


}
