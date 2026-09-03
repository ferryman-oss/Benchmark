package val;

import org.assertj.core.api.Assertions;

public class App {
    public static void requireEqual(Object expected, Object actual) {
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
