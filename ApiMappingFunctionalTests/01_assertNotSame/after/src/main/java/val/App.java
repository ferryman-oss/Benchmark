package val;

import org.assertj.core.api.Assertions;

public class App {
    public static void requireDistinct(Object a, Object b) {
        Assertions.assertThat(a).isNotSameAs(b);
    }
}
