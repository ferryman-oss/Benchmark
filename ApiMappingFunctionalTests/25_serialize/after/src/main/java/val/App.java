package val;

import com.google.gson.Gson;

public class App {
    public static String serialize(Object value) {
        return new Gson().toJson(value);
    }
}
