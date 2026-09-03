package val;

import org.kohsuke.github.GitHub;

public class App {
    public static int issueNumber(String owner, String repo, int number) throws Exception {
        GitHub github = GitHub.connectAnonymously();
        return github.getRepository(owner + "/" + repo).getIssue(number).getNumber();
    }
}
