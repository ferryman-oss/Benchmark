package val;

import org.junit.jupiter.api.Assertions;

public class App {
    public static void requireClose(double expected, double actual, double delta) {
        Assertions.assertEquals(expected, actual, delta);
    }
}
