package val;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void helloReturns200() throws Exception {
        Assertions.assertEquals(200, App.helloStatus());
    }
}
