package val;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void falseOk() {
        App.requireFalse(false);
    }

    @Test
    void trueFails() {
        Assertions.assertThrows(AssertionError.class, () -> App.requireFalse(true));
    }
}
