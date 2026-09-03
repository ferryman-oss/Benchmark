package val;

import org.junit.jupiter.api.Assertions;

public class App {
    public static void requireArrayEqual(Object[] expected, Object[] actual) {
        Assertions.assertArrayEquals(expected, actual);
    }
}
