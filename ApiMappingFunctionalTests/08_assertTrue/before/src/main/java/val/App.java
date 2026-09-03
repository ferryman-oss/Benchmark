package val;

import org.junit.jupiter.api.Assertions;

public class App {
    public static void requireTrue(boolean value) {
        Assertions.assertTrue(value, "must be true");
    }
}
