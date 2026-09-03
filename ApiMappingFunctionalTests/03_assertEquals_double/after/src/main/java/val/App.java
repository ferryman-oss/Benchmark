package val;

import org.assertj.core.api.Assertions;

public class App {
    public static void requireClose(double expected, double actual, double delta) {
        Assertions.assertThat(actual).isCloseTo(expected, Assertions.offset(delta));
    }
}
