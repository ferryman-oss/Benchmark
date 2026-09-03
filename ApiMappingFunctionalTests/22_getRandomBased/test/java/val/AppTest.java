package val;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void versionIsRandom() {
        Assertions.assertEquals(4, App.randomBased().version());
    }
}
