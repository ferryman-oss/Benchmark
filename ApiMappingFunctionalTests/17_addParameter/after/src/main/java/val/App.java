package val;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;

public class App {
    public static String formBody(String key, String value) throws Exception {
        HttpPost post = new HttpPost("http://example.com");
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair(key, value));
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(params);
        post.setEntity(entity);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        post.getEntity().writeTo(out);
        return out.toString("UTF-8");
    }
}
