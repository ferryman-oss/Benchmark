package val;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void sameItemsOk() {
        App.requireIterableEqual(Arrays.asList("a", "b"), Arrays.asList("a", "b"));
    }

    @Test
    void differentItemsFail() {
        Assertions.assertThrows(AssertionError.class,
                () -> App.requireIterableEqual(Arrays.asList("a"), Arrays.asList("b")));
    }
}
