import java.math.BigDecimal;

public class Calculator {

    private BigDecimal accumulator = BigDecimal.ZERO;
    private BigDecimal operand1 = BigDecimal.ZERO;
    private BigDecimal operand2 = BigDecimal.ZERO;

    public BigDecimal getAccumulator() {
        return accumulator;
    }

    public void setAccumulator(BigDecimal value) {
        accumulator = value;
    }

    public void setOperands(BigDecimal value1, BigDecimal value2) {
        operand1 = value1;
        operand2 = value2;
    }

    public void add() {
        accumulator = operand1.add(operand2);
    }

    public void subtract() {
        accumulator = operand1.subtract(operand2);
    }

    public void multiply() {
        accumulator = operand1.multiply(operand2);
    }

    public void divide() {
        accumulator = operand1.divide(operand2);
    }
}
