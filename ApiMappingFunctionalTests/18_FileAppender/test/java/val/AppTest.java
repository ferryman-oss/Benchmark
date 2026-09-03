package val;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void writesMessageToFile() throws Exception {
        Assertions.assertTrue(App.writeLog("hello-file").contains("hello-file"));
    }
}
