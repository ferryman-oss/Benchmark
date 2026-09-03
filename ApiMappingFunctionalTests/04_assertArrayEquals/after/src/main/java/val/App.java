package val;

import org.assertj.core.api.Assertions;

public class App {
    public static void requireArrayEqual(Object[] expected, Object[] actual) {
        Assertions.assertThat(actual).containsExactly(expected);
    }
}
