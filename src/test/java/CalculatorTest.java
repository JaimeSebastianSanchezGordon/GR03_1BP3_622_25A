import org.junit.*;

import static org.junit.Assert.*;
public class CalculatorTest {
    Calculator calculadora = null;

    @BeforeClass
    public static void setUpClass(){
        System.out.println("SETUPCLASS()");
    }

    @Before
    public void setUp(){
        calculadora = new Calculator();
        System.out.println("SETUP()");
    }

    //    ANOTACION
    @Test
    public void given_two_Integers_when_addition_then_ok(){
        assertEquals(6, calculadora.addition(4, 2));
        System.out.println("TEST 1");

    }

    @Test
    public void given_two_Integers_when_subtraction_then_ok(){
        assertEquals(2, calculadora.subtraction(4, 2));
        System.out.println("TEST 2");
    }

    //  PARA CUANDO ESPEREMOS UNA Exception
//    @Test(expected = ArithmeticException.class)
    @Test
    public void given_two_Integers_when_division_then_exception(){
        assertEquals(3, calculadora.division(6,2));
        System.out.println("TEST 3");
    }

    //    CUANDO NOS CONECTAMOS CON BD Y SE ESPERA MUCHO PUEDE SER PELIGROSO
    @Test(timeout = 150)
    public void given_two_Integers_when_multiplication_then_timeout(){
        assertEquals(6, calculadora.multiplication(3, 2));
        System.out.println("TEST 4");
    }

    //    QUIERO QUE SE EJECUTE DESPUES DE EJECUTAR CUALQUIERA DE LOS TEST
    @After
    public void tearDown(){
        System.out.println("TEAR DOWN()");
        calculadora.setAns(0);
        calculadora = null;
    }

    @AfterClass
    public static void tearDownClass(){
        System.out.println("TEARDOWNCLASS()");
    }


}