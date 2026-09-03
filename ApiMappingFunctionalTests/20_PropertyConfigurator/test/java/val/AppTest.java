package val;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void configureThenLog() throws Exception {
        Assertions.assertTrue(App.configuredLog("hello-config").contains("hello-config"));
    }
}
