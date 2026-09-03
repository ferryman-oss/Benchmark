package val;

import org.json.JSONArray;

public class App {
    public static String getString(String json, int index) throws Exception {
        return new JSONArray(json).getString(index);
    }
}
