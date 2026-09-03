package val;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void withinDeltaOk() {
        App.requireClose(1.0, 1.001, 0.01);
    }

    @Test
    void outsideDeltaFails() {
        Assertions.assertThrows(AssertionError.class, () -> App.requireClose(1.0, 2.0, 0.01));
    }
}
