package val;

import flexjson.JSONSerializer;

public class App {
    public static String serialize(Object value) {
        return new JSONSerializer().serialize(value);
    }
}
