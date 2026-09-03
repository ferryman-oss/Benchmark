package val;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void bodyIsStoredOnRequest() throws Exception {
        Assertions.assertEquals("hello", App.postBody("hello"));
    }
}
