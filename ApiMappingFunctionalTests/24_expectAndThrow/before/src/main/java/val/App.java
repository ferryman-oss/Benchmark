package val;

import org.easymock.MockControl;

interface Boom {
    String go();
}

public class App {
    public static void stubThrow() {
        MockControl ctrl = MockControl.createControl(Boom.class);
        Boom boom = (Boom) ctrl.getMock();
        ctrl.expectAndThrow(boom.go(), new IllegalStateException("x"));
        ctrl.replay();
        boom.go();
    }
}
