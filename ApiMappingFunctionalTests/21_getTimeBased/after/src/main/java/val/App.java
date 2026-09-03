package val;

import java.util.UUID;
import com.fasterxml.uuid.Generators;

public class App {
    public static UUID timeBased() {
        return Generators.timeBasedGenerator().generate();
    }
}
