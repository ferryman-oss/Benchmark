package val;

import org.iq80.snappy.Snappy;

public class App {
    public static byte[] roundtrip(byte[] input) {
        byte[] compressed = Snappy.compress(input);
        return Snappy.uncompress(compressed, 0, compressed.length);
    }
}
