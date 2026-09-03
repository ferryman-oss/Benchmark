package val;

import org.junit.jupiter.api.Assertions;

public class App {
    public static void requireIllegalArgument(Runnable action) {
        Assertions.assertThrows(IllegalArgumentException.class, action::run);
    }
}
