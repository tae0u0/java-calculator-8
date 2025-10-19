package calculator.service;

import calculator.domain.Numbers;

import calculator.service.validator.InputValidator;
import java.util.ArrayList;
import java.util.List;

public class NumbersUtils {
    private final InputValidator validator;

    public NumbersUtils() {
        this.validator = new InputValidator();
    }

    public Numbers parse(List<String> tokens) {
        List<Integer> numbers = new ArrayList<>();

        for (String token : tokens) {
            validator.validateNumber(token);
            numbers.add(Integer.parseInt(token.trim()));
        }

        return new Numbers(numbers);
    }
}
