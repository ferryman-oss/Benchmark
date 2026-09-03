package val;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void distinctObjectsOk() {
        App.requireDistinct(new Object(), new Object());
    }

    @Test
    void sameObjectFails() {
        Object o = new Object();
        Assertions.assertThrows(AssertionError.class, () -> App.requireDistinct(o, o));
    }
}
