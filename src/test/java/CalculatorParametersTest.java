import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class CalculatorParametersTest {
    private int a, b, expected;

    //    TIENE QUE SER STATIC
//    PARA PROBAR LOS POSIBLES ESCENARIOS
    @Parameterized.Parameters
    public static Iterable<Object[]> parameters() {
        List<Object[]> data = new ArrayList<Object[]>();
        data.add(new Object[]{4, 0, 4 });
        data.add(new Object[]{4, 3, 7});
        data.add(new Object[]{4, 10, 34});
        data.add(new Object[]{4, 20, 24});
        data.add(new Object[]{5, 0, 6});
        data.add(new Object[]{4, 6, 10});
        return data;
    }

    public CalculadoraParametersTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void given_two_Integers_when_addition_then_ok(){
        Calculator calculadora = new Calculator();
        int actual = calculadora.addition(a, b);
        assertEquals(expected, actual);
        System.out.println("TEST 1");

    }
}