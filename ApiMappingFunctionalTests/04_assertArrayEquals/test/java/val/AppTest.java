package val;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void sameItemsOk() {
        App.requireArrayEqual(new String[] {"a", "b"}, new String[] {"a", "b"});
    }

    @Test
    void differentItemsFail() {
        Assertions.assertThrows(AssertionError.class,
                () -> App.requireArrayEqual(new String[] {"a"}, new String[] {"b"}));
    }
}
