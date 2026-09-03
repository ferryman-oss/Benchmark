package val;

import java.io.ByteArrayOutputStream;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;

public class App {
    public static String postBody(String body) throws Exception {
        HttpPost post = new HttpPost("http://example.com");
        StringEntity entity = new StringEntity(body);
        post.setEntity(entity);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        post.getEntity().writeTo(out);
        return out.toString("UTF-8");
    }
}
