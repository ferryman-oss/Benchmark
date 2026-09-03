package val;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void xmlContainsRootAndText() throws Exception {
        String xml = App.writeRoot("x");
        Assertions.assertTrue(xml.contains("root"));
        Assertions.assertTrue(xml.contains("x"));
    }
}
