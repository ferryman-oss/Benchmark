package val;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void encodesFormPair() throws Exception {
        Assertions.assertTrue(App.formBody("k", "v").contains("k=v"));
    }
}
