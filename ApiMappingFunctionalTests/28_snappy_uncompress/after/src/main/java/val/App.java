package val;

import io.airlift.compress.snappy.SnappyCompressor;
import io.airlift.compress.snappy.SnappyDecompressor;

public class App {
    public static byte[] roundtrip(byte[] input) {
        SnappyCompressor compressor = new SnappyCompressor();
        int max = compressor.maxCompressedLength(input.length);
        byte[] compressed = new byte[max];
        int n = compressor.compress(input, 0, input.length, compressed, 0, max);
        SnappyDecompressor decompressor = new SnappyDecompressor();
        int ulen = decompressor.getUncompressedLength(compressed, 0);
        byte[] round = new byte[ulen];
        decompressor.decompress(compressed, 0, n, round, 0, ulen);
        return round;
    }
}
