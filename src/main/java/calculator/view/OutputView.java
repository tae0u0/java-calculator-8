package calculator.view;

public class OutputView implements View {
    private static final String RESULT_FORMAT = "결과 : %d";

    @Override
    public void display(String message) {
        System.out.println(message);
    }

    public void displayResult(int result) {
        display(String.format(RESULT_FORMAT, result));
    }
}
