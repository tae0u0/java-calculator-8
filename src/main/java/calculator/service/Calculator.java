package calculator.service;

import calculator.domain.Delimiters;
import calculator.domain.Numbers;

import calculator.service.operator.AddOperator;
import calculator.service.operator.Operator;
import calculator.service.validator.InputValidator;
import java.util.List;

public class Calculator {
    private final InputValidator inputValidator;
    private final DelimitersUtils delimitersUtils;
    private final StringSpliter stringSpliter;
    private final NumbersUtils numbersUtils;
    private final Operator operator;

    public Calculator() {
        this.inputValidator = new InputValidator();
        this.delimitersUtils = new DelimitersUtils();
        this.stringSpliter = new StringSpliter();
        this.numbersUtils = new NumbersUtils();
        this.operator = new AddOperator();
    }

    public int calculate(String input) {
        inputValidator.validate(input);

        if (input.isEmpty()) {
            return 0;
        }

        Delimiters delimiters = delimitersUtils.parse(input);
        String processedInput = delimitersUtils.removeCustomDelimiterPrefix(input);

        List<String> tokens = stringSpliter.split(processedInput, delimiters);
        Numbers numbers = numbersUtils.parse(tokens);

        return operator.operate(numbers);
    }
}
