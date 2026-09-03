package val;

import com.google.gson.JsonParser;

public class App {
    public static String getString(String json, int index) {
        return new JsonParser().parse(json).getAsJsonArray().get(index).getAsString();
    }
}
