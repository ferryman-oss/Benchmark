package val;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void authenticatedLoginIsPresent() throws Exception {
        String login = App.authenticatedLogin();
        Assertions.assertNotNull(login);
        Assertions.assertFalse(login.isEmpty());
    }
}
