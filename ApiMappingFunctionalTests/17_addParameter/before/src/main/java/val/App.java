package val;

import java.io.ByteArrayOutputStream;
import org.apache.commons.httpclient.methods.PostMethod;

public class App {
    public static String formBody(String key, String value) throws Exception {
        PostMethod post = new PostMethod("http://example.com");
        post.addParameter(key, value);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        post.getRequestEntity().writeRequest(out);
        return out.toString("UTF-8");
    }
}
