package val;

import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.URL;
import spark.Spark;

public class App {
    public static int helloStatus() throws Exception {
        ServerSocket ss = new ServerSocket(0);
        int port = ss.getLocalPort();
        ss.close();
        Spark.port(port);
        Spark.get("/hello", (req, res) -> "hello");
        Spark.init();
        Spark.awaitInitialization();
        try {
            HttpURLConnection c = (HttpURLConnection) new URL("http://127.0.0.1:" + port + "/hello").openConnection();
            c.setConnectTimeout(3000);
            c.setReadTimeout(3000);
            return c.getResponseCode();
        } finally {
            Spark.stop();
            Spark.awaitStop();
        }
    }
}
