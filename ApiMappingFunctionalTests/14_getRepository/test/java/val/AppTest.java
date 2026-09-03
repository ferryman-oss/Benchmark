package val;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void publicRepoName() throws Exception {
        Assertions.assertEquals("Hello-World", App.repositoryName("octocat", "Hello-World"));
    }
}
