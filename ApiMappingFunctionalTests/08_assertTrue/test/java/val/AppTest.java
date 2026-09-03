package val;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void trueOk() {
        App.requireTrue(true);
    }

    @Test
    void falseFails() {
        Assertions.assertThrows(AssertionError.class, () -> App.requireTrue(false));
    }
}
