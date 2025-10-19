package calculator.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView implements View {
    private static final String INPUT_PROMPT = "덧셈할 문자열을 입력해 주세요.";

    @Override
    public void display(String message) {
        System.out.println(message);
    }

    public String readInput() {
        display(INPUT_PROMPT);
        return Console.readLine();
    }
}
