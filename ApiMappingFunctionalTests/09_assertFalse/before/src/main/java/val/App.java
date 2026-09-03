package val;

import org.junit.jupiter.api.Assertions;

public class App {
    public static void requireFalse(boolean value) {
        Assertions.assertFalse(value, "must be false");
    }
}
