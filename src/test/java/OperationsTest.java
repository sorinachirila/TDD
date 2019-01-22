import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class OperationsTest {

    private Calculator calculator;

    @Before
    public void createCalculatorWithTwoValues() {
        calculator = new Calculator();
        calculator.setOperands(new BigDecimal(20), new BigDecimal(4));
    }

    @Test
    public void testAdd() {
        calculator.add();
        assertEquals(new BigDecimal(24), calculator.getAccumulator());
    }

    @Test
    public void testSubtract() {
        calculator.subtract();
        assertEquals(new BigDecimal(16), calculator.getAccumulator());
    }

    @Test
    public void testMultiply() {
        calculator.multiply();
        assertEquals(new BigDecimal(80), calculator.getAccumulator());
    }

    @Test
    public void testDivide() {
        calculator.divide();
        assertEquals(new BigDecimal(5), calculator.getAccumulator());
    }
}
