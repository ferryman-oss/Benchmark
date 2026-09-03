package val;

import org.assertj.core.api.Assertions;

public class App {
    public static void requireQuiet(Runnable action) {
        Assertions.assertThatCode(action::run).doesNotThrowAnyException();
    }
}
