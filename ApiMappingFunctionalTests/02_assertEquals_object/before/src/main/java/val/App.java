package val;

import org.junit.jupiter.api.Assertions;

public class App {
    public static void requireEqual(Object expected, Object actual) {
        Assertions.assertEquals(expected, actual);
    }
}
