package val;

import com.google.gson.JsonParser;

public class App {
    public static boolean getBoolean(String json, String key) {
        return new JsonParser().parse(json).getAsJsonObject().get(key).getAsBoolean();
    }
}
