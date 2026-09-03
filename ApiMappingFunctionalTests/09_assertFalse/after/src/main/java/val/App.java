package val;

import org.assertj.core.api.Assertions;

public class App {
    public static void requireFalse(boolean value) {
        Assertions.assertThat(value).as("must be false").isFalse();
    }
}
