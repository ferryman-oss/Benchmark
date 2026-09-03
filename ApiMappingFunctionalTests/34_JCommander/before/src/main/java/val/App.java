package val;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

public class App {
    public static class Args {
        @Parameter(names = "-n")
        public String name;
    }

    public static String parseName(String... argv) {
        Args args = new Args();
        new JCommander(args, argv);
        return args.name;
    }
}
