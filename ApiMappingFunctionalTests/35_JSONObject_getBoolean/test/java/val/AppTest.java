package val;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void readsBooleanField() throws Exception {
        Assertions.assertTrue(App.getBoolean("{\"ok\":true}", "ok"));
        Assertions.assertFalse(App.getBoolean("{\"ok\":false}", "ok"));
    }
}
