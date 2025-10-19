package calculator.service.validator;

public class InputValidator implements Validator<String> {
    @Override
    public void validate(String input) {
        if (input == null) {
            throw new IllegalArgumentException("입력값이 null입니다.");
        }
    }

    public void validateNumber(String number) {
        try {
            int value = Integer.parseInt(number.trim());
            if (value < 0) {
                throw new IllegalArgumentException("음수는 허용되지 않습니다.");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("올바른 숫자 형식이 아닙니다: " + number);
        }
    }
}
