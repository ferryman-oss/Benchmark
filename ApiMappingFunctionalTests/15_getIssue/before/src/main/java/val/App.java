package val;

import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.IssueService;

public class App {
    public static int issueNumber(String owner, String repo, int number) throws Exception {
        GitHubClient client = new GitHubClient();
        IssueService svc = new IssueService(client);
        return svc.getIssue(owner, repo, number).getNumber();
    }
}
