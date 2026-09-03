package val;

import org.assertj.core.api.Assertions;

public class App {
    public static void requireIllegalArgument(Runnable action) {
        Assertions.assertThatThrownBy(action::run).isInstanceOf(IllegalArgumentException.class);
    }
}
