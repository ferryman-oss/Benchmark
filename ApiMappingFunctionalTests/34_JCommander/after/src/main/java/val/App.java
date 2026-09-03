package val;

import picocli.CommandLine;

public class App {
    public static class Args {
        @CommandLine.Option(names = "-n")
        public String name;
    }

    public static String parseName(String... argv) {
        Args args = new Args();
        CommandLine cmd = new CommandLine(args);
        cmd.parseArgs(argv);
        return args.name;
    }
}
