package calculator.service.validator;

public interface Validator<T> {
    void validate(T target);
}
