package calculator.service;

import calculator.domain.Delimiters;

import java.util.ArrayList;
import java.util.List;

public class DelimitersUtils {
    private static final String CUSTOM_DELIMITER_PREFIX = "//";
    private static final String CUSTOM_DELIMITER_SUFFIX = "\\n";
    private static final String DEFAULT_DELIMITER_COMMA = ",";
    private static final String DEFAULT_DELIMITER_COLON = ":";

    public Delimiters parse(String input) {
        List<String> delimiters = new ArrayList<>();
        delimiters.add(DEFAULT_DELIMITER_COMMA);
        delimiters.add(DEFAULT_DELIMITER_COLON);

        if (hasCustomDelimiter(input)) {
            String customDelimiter = extractCustomDelimiter(input);
            delimiters.add(customDelimiter);
        }

        return new Delimiters(delimiters);
    }

    public boolean hasCustomDelimiter(String input) {
        return input.startsWith(CUSTOM_DELIMITER_PREFIX);
    }

    public String extractCustomDelimiter(String input) {
        int startIndex = CUSTOM_DELIMITER_PREFIX.length();
        int endIndex = input.indexOf(CUSTOM_DELIMITER_SUFFIX);
        return input.substring(startIndex, endIndex);
    }

    public String removeCustomDelimiterPrefix(String input) {
        if (!hasCustomDelimiter(input)) {
            return input;
        }
        int delimiterEndIndex = input.indexOf(CUSTOM_DELIMITER_SUFFIX);
        return input.substring(delimiterEndIndex + CUSTOM_DELIMITER_SUFFIX.length());
    }
}
