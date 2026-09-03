package val;

import junit.framework.TestCase;

public class AppTest extends TestCase {
    public void testStubThrow() {
        try {
            App.stubThrow();
            fail();
        } catch (IllegalStateException ex) {
            assertEquals("x", ex.getMessage());
        }
    }
}
