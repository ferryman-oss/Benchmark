package val;

import org.junit.jupiter.api.Assertions;

public class App {
    public static void requireQuiet(Runnable action) {
        Assertions.assertDoesNotThrow(action::run);
    }
}
