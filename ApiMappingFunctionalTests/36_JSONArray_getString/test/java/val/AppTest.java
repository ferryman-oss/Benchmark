package val;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void readsStringAtIndex() throws Exception {
        Assertions.assertEquals("b", App.getString("[\"a\",\"b\"]", 1));
    }
}
