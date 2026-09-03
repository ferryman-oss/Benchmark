package val;

import org.mockito.Mockito;

interface Boom {
    String go();
}

public class App {
    public static void stubThrow() {
        Boom boom = Mockito.mock(Boom.class);
        Mockito.when(boom.go()).thenThrow(new IllegalStateException("x"));
        boom.go();
    }
}
