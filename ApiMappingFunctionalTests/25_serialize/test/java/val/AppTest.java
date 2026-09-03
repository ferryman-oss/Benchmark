package val;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    public static class Box {
        public String name = "n";
        public int n = 1;
    }

    @Test
    void jsonContainsFields() {
        String json = App.serialize(new Box());
        Assertions.assertTrue(json.contains("n"));
        Assertions.assertTrue(json.contains("1"));
    }
}
