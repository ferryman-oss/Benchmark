package val;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import org.kohsuke.github.GitHub;

public class App {

    static String githubToken() throws Exception {
        String t = System.getenv("GITHUB_OAUTH");
        if (t == null || t.isEmpty()) {
            t = System.getenv("GITHUB_TOKEN");
        }
        if (t != null && !t.isEmpty()) {
            return t.trim();
        }
        java.nio.file.Path env = java.nio.file.Paths.get(System.getProperty("user.dir"), "..", ".env");
        if (java.nio.file.Files.isRegularFile(env)) {
            for (String line : java.nio.file.Files.readAllLines(env)) {
                String s = line.trim();
                if (s.startsWith("GITHUB_TOKEN=")) {
                    return s.substring("GITHUB_TOKEN=".length()).trim();
                }
                if (s.startsWith("GITHUB_OAUTH=")) {
                    return s.substring("GITHUB_OAUTH=".length()).trim();
                }
            }
        }
        throw new IllegalStateException("GITHUB_TOKEN is missing");
    }

    public static String repositoryName(String owner, String name) throws Exception {
        String homePrev = System.getProperty("user.home");
        Path home = Files.createTempDirectory("ghhome");
        try {
            Files.write(home.resolve(".github"),
                    ("oauth=" + githubToken() + "\n").getBytes(StandardCharsets.UTF_8));
            System.setProperty("user.home", home.toAbsolutePath().toString());
            GitHub github = GitHub.connect();
            return github.getRepository(owner + "/" + name).getName();
        } finally {
            if (homePrev != null) {
                System.setProperty("user.home", homePrev);
            }
        }
    }
}
