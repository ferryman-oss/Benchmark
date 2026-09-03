package val;

import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.RepositoryService;

public class App {
    public static String repositoryName(String owner, String name) throws Exception {
        GitHubClient client = new GitHubClient();
        RepositoryService svc = new RepositoryService(client);
        return svc.getRepository(owner, name).getName();
    }
}
