package org.veritasopher.seniz;

import org.apache.commons.cli.*;
import org.veritasopher.seniz.config.Info;

/**
 * Application
 *
 * @author Yepeng Ding
 * @date 12/2/2020
 */
public class App {
    public static void main(String[] args) {
        Options options = initOptions();
        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();

        try {
            CommandLine cmd = parser.parse(options, args);
            if (cmd.hasOption("h")) {
                formatter.printHelp(Info.SYSTEM_NAME, options);
            }
        } catch (ParseException e) {
            formatter.printHelp(Info.SYSTEM_NAME, options);
            System.exit(0);
        }
    }

    private static Options initOptions() {
        Options options = new Options();
        Option help = new Option("h", "help", false, "print help.");
        Option outputPath = Option.builder("o")
                .longOpt("output")
                .hasArg()
                .argName("path")
                .type(String.class)
                .desc("output path.")
                .build();
        options.addOption(help);
        options.addOption(outputPath);
        return options;
    }
}
