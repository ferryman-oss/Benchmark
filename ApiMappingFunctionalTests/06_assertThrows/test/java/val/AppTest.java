package val;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void throwsExpectedOk() {
        App.requireIllegalArgument(() -> {
            throw new IllegalArgumentException("bad");
        });
    }

    @Test
    void noThrowFails() {
        Assertions.assertThrows(AssertionError.class, () -> App.requireIllegalArgument(() -> {}));
    }
}
