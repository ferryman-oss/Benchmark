package val;

import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.URL;
import io.javalin.Javalin;

public class App {
    public static int helloStatus() throws Exception {
        ServerSocket ss = new ServerSocket(0);
        int port = ss.getLocalPort();
        ss.close();
        Javalin app = Javalin.create(config -> {
            config.jetty.defaultPort = port;
        });
        app.get("/hello", ctx -> ctx.result("hello"));
        app.start();
        try {
            HttpURLConnection c = (HttpURLConnection) new URL("http://127.0.0.1:" + port + "/hello").openConnection();
            c.setConnectTimeout(3000);
            c.setReadTimeout(3000);
            return c.getResponseCode();
        } finally {
            app.stop();
        }
    }
}
