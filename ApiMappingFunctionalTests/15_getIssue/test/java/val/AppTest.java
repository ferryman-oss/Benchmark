package val;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void publicIssueNumber() throws Exception {
        Assertions.assertEquals(1, App.issueNumber("octocat", "Hello-World", 1));
    }
}
