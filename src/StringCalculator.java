import java.util.Arrays;

public class StringCalculator {

    protected int sumNumbersFrom(String expression) {
        String[] numbers = getNumbersFrom(expression);
        return Arrays.stream(numbers)
                .filter(this::isNumber)
                .mapToInt(Integer::parseInt)
                .sum();
    }

    private String[] getNumbersFrom(String expression) {
        String separator = getSeparatorFrom(expression);
        String expressionToAdd = getNumbersWithoutCustomSeparator(expression);
        return expressionToAdd.split(separator);
    }

    private String getSeparatorFrom(String expression) {
        if (hasCustomSeparator(expression)) {
            return expression.substring(2, expression.indexOf(";"));
        }
        return ",";
    }

    private String getNumbersWithoutCustomSeparator(String expression) {
        if (hasCustomSeparator(expression)) {
            int beginningOfNumbersString = expression.indexOf(";") + 1;
            return expression.substring(beginningOfNumbersString);
        }
        return expression;
    }

    private boolean isNumber(String number) {
        return number.matches("\\d");
    }

    private boolean hasCustomSeparator(String expression) {
        return expression.contains("//");
    }
}
