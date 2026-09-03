package val;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void noThrowOk() {
        App.requireQuiet(() -> {});
    }

    @Test
    void throwFails() {
        Assertions.assertThrows(AssertionError.class, () -> App.requireQuiet(() -> {
            throw new IllegalStateException("x");
        }));
    }
}
