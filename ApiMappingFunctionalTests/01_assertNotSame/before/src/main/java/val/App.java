package val;

import org.junit.jupiter.api.Assertions;

public class App {
    public static void requireDistinct(Object a, Object b) {
        Assertions.assertNotSame(a, b);
    }
}
