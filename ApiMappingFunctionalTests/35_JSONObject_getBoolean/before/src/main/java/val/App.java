package val;

import org.json.JSONObject;

public class App {
    public static boolean getBoolean(String json, String key) throws Exception {
        return new JSONObject(json).getBoolean(key);
    }
}
