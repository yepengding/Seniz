package org.veritasopher.seniz.core.model;

import com.google.common.io.Files;
import lombok.Data;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;
import org.veritasopher.seniz.core.tool.Parsing;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Source File Information
 *
 * @author Yepeng Ding
 * @date 12/18/2020
 */
@Data
public class SourceFile {

    private String identifier;

    private String path;

    private CharStream charStream;

    private ParseTree parseTree;

    private UnitDependency dependency;

    public SourceFile(String path) throws IOException {
        this.path = path;
        this.identifier = Files.getNameWithoutExtension(path);

        // Read source files as char streams
        this.charStream = CharStreams.fromStream(new FileInputStream(path));

        // Get parse tree from char streams
        this.parseTree = Parsing.getParseTreeFromSource(charStream);
    }
}
