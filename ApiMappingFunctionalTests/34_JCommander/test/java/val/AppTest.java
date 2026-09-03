package val;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void parsesNameFlag() {
        Assertions.assertEquals("bob", App.parseName("-n", "bob"));
    }
}
