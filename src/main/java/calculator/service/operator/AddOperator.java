package calculator.service.operator;

import calculator.domain.Numbers;

public class AddOperator implements Operator {
    @Override
    public int operate(Numbers numbers) {
        return numbers.sum();
    }
}
