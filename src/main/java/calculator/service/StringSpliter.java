package calculator.service;

import calculator.domain.Delimiters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringSpliter {
    public List<String> split(String input, Delimiters delimiters) {
        if (input == null || input.isEmpty()) {
            return new ArrayList<>();
        }

        String regex = createRegex(delimiters);
        List<String> tokens = Arrays.stream(input.split(regex)).toList();

        return tokens;
    }

    private String createRegex(Delimiters delimiters) {
        List<String> delimiterList = delimiters.getDelimiters();

        String regex = delimiterList.stream()
                .map(Pattern::quote)
                .collect(Collectors.joining("|"));

        return regex;
    }
}