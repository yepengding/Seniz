package org.veritasopher.seniz;

import org.apache.commons.cli.*;
import org.veritasopher.seniz.config.Info;
import org.veritasopher.seniz.exception.GlobalExceptionHandler;

/**
 * Application
 *
 * @author Yepeng Ding
 * @date 12/2/2020
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
            formatter.printHelp(Info.USAGE, options);
            System.exit(0);
        }
    }

    private static void argHandler(CommandLine cmd) {
        if (cmd.getArgs().length == 0) {
            formatter.printHelp(Info.USAGE, options);
            System.exit(0);
        }

        if (cmd.hasOption("v")) {
            System.out.println(Info.VERSION);
        }
        if (cmd.hasOption("h")) {
            formatter.printHelp(Info.USAGE, options);
        }
    }

    private static void initOptions() {
        options = new Options();
        Option version = new Option("v", "version", false, "print current version.");
        Option help = new Option("h", "help", false, "print help.");
        Option outputPath = Option.builder("o")
                .longOpt("output")
                .hasArg()
                .argName("path")
                .type(String.class)
                .desc("output path.")
                .build();
        options.addOption(version);
        options.addOption(help);
        options.addOption(outputPath);
    }
}
