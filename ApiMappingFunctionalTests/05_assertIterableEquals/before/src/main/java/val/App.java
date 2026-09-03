package val;

import org.junit.jupiter.api.Assertions;

public class App {
    public static void requireIterableEqual(Iterable<?> expected, Iterable<?> actual) {
        Assertions.assertIterableEquals(expected, actual);
    }
}
