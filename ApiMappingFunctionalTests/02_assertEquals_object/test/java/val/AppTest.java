package val;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void equalStringsOk() {
        App.requireEqual("ok", "ok");
    }

    @Test
    void differentStringsFail() {
        Assertions.assertThrows(AssertionError.class, () -> App.requireEqual("a", "b"));
    }
}
