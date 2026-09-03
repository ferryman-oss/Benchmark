package val;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void versionIsTimeBased() {
        Assertions.assertEquals(1, App.timeBased().version());
    }
}
