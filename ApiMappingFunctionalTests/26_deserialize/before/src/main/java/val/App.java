package val;

import flexjson.JSONDeserializer;

public class App {
    public static <T> T deserialize(String json, Class<T> type) {
        return new JSONDeserializer<T>().deserialize(json, type);
    }
}
