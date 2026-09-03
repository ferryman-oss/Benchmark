package val;

import org.easymock.MockControl;

interface Calc {
    int add(int a, int b);
}

public class App {
    public static int stubAdd() {
        MockControl ctrl = MockControl.createControl(Calc.class);
        Calc calc = (Calc) ctrl.getMock();
        ctrl.expectAndReturn(calc.add(1, 2), 3);
        ctrl.replay();
        return calc.add(1, 2);
    }
}
