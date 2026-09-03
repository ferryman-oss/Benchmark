package val;

import org.assertj.core.api.Assertions;

public class App {
    public static void requireTrue(boolean value) {
        Assertions.assertThat(value).as("must be true").isTrue();
    }
}
