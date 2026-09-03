package val;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void uncompressRoundtrip() {
        byte[] input = "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb".getBytes();
        Assertions.assertArrayEquals(input, App.roundtrip(input));
    }
}
