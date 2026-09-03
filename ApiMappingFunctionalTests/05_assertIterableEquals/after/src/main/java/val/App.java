package val;

import org.assertj.core.api.Assertions;

public class App {
    @SuppressWarnings({"unchecked", "rawtypes"})
    public static void requireIterableEqual(Iterable<?> expected, Iterable<?> actual) {
        Assertions.assertThat((Iterable) actual).containsExactlyElementsOf((Iterable) expected);
    }
}
