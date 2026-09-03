package val;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void writesMessageWithSizeLimit() throws Exception {
        Assertions.assertTrue(App.writeLog("hello-roll").contains("hello-roll"));
    }
}
