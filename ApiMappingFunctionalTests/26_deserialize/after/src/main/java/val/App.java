package val;

import com.google.gson.Gson;

public class App {
    public static <T> T deserialize(String json, Class<T> type) {
        return new Gson().fromJson(json, type);
    }
}
