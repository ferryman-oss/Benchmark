package val;

import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.UserService;

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

    public static String authenticatedLogin() throws Exception {
        GitHubClient client = new GitHubClient();
        client.setOAuth2Token(githubToken());
        return new UserService(client).getUser().getLogin();
    }
}
