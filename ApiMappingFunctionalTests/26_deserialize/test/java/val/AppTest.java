package val;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    public static class Box {
        public String name;
        public int n;
    }

    @Test
    void roundTripsFields() {
        Box box = App.deserialize("{\"name\":\"x\",\"n\":2}", Box.class);
        Assertions.assertEquals("x", box.name);
        Assertions.assertEquals(2, box.n);
    }
}
