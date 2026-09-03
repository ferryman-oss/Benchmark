package val;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void compressRoundtrip() {
        byte[] input = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa".getBytes();
        Assertions.assertArrayEquals(input, App.roundtrip(input));
    }
}
