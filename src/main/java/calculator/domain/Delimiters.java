package calculator.domain;

import java.util.ArrayList;
import java.util.List;

public class Delimiters {
    private final List<String> delimiters;

    public Delimiters(List<String> delimiters) {
        this.delimiters = new ArrayList<>(delimiters);
    }

    public List<String> getDelimiters() {
        return new ArrayList<>(delimiters);
    }
}
