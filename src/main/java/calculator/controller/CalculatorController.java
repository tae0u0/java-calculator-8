package calculator.controller;

import calculator.service.Calculator;
import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorController {
    private final Calculator calculator;
    private final InputView inputView;
    private final OutputView outputView;

    public CalculatorController() {
        this.calculator = new Calculator();
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void run() {
        try {
            String input = inputView.readInput();
            int result = calculator.calculate(input);
            outputView.displayResult(result);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
