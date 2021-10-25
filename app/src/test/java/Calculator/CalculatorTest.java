package Calculator.app.src.test.java.Calculator;

import Calculator.app.src.main.java.Calculator.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test public void testAddsTwoAndTwo() {
        Calculator calc = new Calculator();
        assertEquals("2 + 2 should equal 4", Integer.valueOf(4), calc.add(2, 2));
    }
}