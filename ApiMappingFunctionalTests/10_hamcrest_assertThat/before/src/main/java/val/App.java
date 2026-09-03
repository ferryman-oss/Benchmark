package val;

import org.hamcrest.MatcherAssert;

public class App {
    public static void requireTrue(boolean value) {
        MatcherAssert.assertThat("must be true", value);
    }
}
