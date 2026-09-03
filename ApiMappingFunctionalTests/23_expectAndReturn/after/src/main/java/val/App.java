package val;

import org.mockito.Mockito;

interface Calc {
    int add(int a, int b);
}

public class App {
    public static int stubAdd() {
        Calc calc = Mockito.mock(Calc.class);
        Mockito.when(calc.add(1, 2)).thenReturn(3);
        return calc.add(1, 2);
    }
}
