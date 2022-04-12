package org.veritasopher.seniz;

import org.apache.commons.cli.*;
import org.veritasopher.seniz.config.Info;
import org.veritasopher.seniz.controller.MasterController;
import org.veritasopher.seniz.core.model.GlobalEnvironment;
import org.veritasopher.seniz.generator.java.JavaGenerator;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.veritasopher.seniz.config.Info.USAGE;
import static org.veritasopher.seniz.config.Info.VERSION;
import static org.veritasopher.seniz.util.FileUtil.getFilePathInResource;

/**
 * Seniz CLI
 *
 * @author Yepeng Ding
 * @date 4/12/2021
 */
public class App {

    private static Options options;
    private static final HelpFormatter formatter = new HelpFormatter();

    public static void main(String[] args) {
        initOptions();
        CommandLineParser parser = new DefaultParser();

        try {
            CommandLine cmd = parser.parse(options, args);
            argHandler(cmd);

        } catch (ParseException e) {
            System.err.println(e.getLocalizedMessage());
            formatter.printHelp(USAGE, options);
            System.exit(0);
        }
    }

    private static void argHandler(CommandLine cmd) {
        if (cmd.hasOption("v")) {
            System.out.println(VERSION);
            System.exit(0);
        } else if (cmd.hasOption("h")) {
            formatter.printHelp(USAGE, options);
            System.exit(0);
        }

        String source = "";
        boolean isDir = false;
        if (cmd.getArgs().length != 1) {
            System.err.println("Please specify a source file or a source directory");
            formatter.printHelp(USAGE, options);
            System.exit(0);
        } else {
            source = cmd.getArgs()[0];
            // If the suffix is not ".sz", then source directory
            isDir = !source.endsWith(".sz");
        }

        // Check existence
        if (Files.notExists(Path.of(source))) {
            if (isDir) {
                System.err.println("The source directory does not exist.");
            } else {
                System.out.println(Path.of(source));
                System.err.println("The source file does not exist.");
            }
            System.exit(0);
        }

        String namespace = "";
        if (cmd.hasOption("n")) {
            namespace = cmd.getOptionValue("n");
        } else {
            System.err.println("Please specify a namespace for Java package.");
            formatter.printHelp(USAGE, options);
            System.exit(0);
        }

        String outputPath = ".";
        if (cmd.hasOption("o")) {
            outputPath = cmd.getOptionValue("o");
        }

        Set<String> sourceFilePaths;
        if (isDir) {
            File folder = new File(source);
            FilenameFilter filter = (f, name) -> name.endsWith(Info.SUFFIX);
            File[] files = folder.listFiles(filter);
            if (files == null) {
                System.err.println("The source directory does not contain valid source files.");
                System.exit(0);
            }
            sourceFilePaths = Arrays.stream(files).parallel().map(File::getAbsolutePath).collect(Collectors.toSet());
        } else {
            sourceFilePaths = new HashSet<>();
            sourceFilePaths.add(source);
        }

        MasterController masterController = new MasterController();
        GlobalEnvironment env = masterController.compile(sourceFilePaths);

        JavaGenerator javaGenerator = new JavaGenerator(env);
        javaGenerator.generateToDir(namespace, outputPath);

    }

    private static void initOptions() {
        options = new Options();
        Option version = new Option("v", "version", false, "print current version.");
        Option help = new Option("h", "help", false, "print help.");
        Option namespace = Option.builder("n")
                .longOpt("name")
                .hasArg()
                .argName("namespace")
                .type(String.class)
                .desc("Java root namespace.")
                .build();
        Option outputPath = Option.builder("o")
                .longOpt("output")
                .hasArg()
                .argName("path")
                .type(String.class)
                .desc("output directory path.")
                .build();
        options.addOption(version);
        options.addOption(help);
        options.addOption(namespace);
        options.addOption(outputPath);
    }
}
