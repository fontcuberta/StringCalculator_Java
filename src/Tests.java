import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Tests {

    // 1 -> 1
    // 1,1 -> 2
    // 1,1,1 -> 3
    // 1,a -> 1
    // a -> 0
    // //#;1#1 -> 2


    @Test
    void it_should_parse_to_int_when_String_have_one_element() {
        assertEquals(sumNumbersFrom("1"), 1);
        assertEquals(sumNumbersFrom("2"), 2);
    }

    @Test
    void it_should_parse_to_int_when_string_have_a_comma() {
        assertEquals(sumNumbersFrom("1,1"), 2);
        assertEquals(sumNumbersFrom("1,1,1"), 3);
    }

    @Test
    void it_should_only_add_numbers() {
        assertEquals(sumNumbersFrom("a"), 0);
        assertEquals(sumNumbersFrom("a,b"), 0);
        assertEquals(sumNumbersFrom("a,1"), 1);
    }

    @Test
    void it_should_add_numbers_using_custom_separator() {
        assertEquals(sumNumbersFrom("//#;1#1"), 2);
    }


    private int sumNumbersFrom(String expression) {

        String separator = getSeparatorFrom(expression);
        String expressionToAdd;

        if (expression.contains("//")) {
            expressionToAdd = expression.substring(expression.indexOf(";") + 1);
        } else {
            expressionToAdd = expression;
        }

        String[] numbers = expressionToAdd.split(separator);

        return Arrays.stream(numbers)
                .filter(number -> number.matches("\\d"))
                .mapToInt(Integer::parseInt)
                .sum();
    }

    private String getSeparatorFrom(String expression) {
        if (expression.contains("//")) {
            return expression.substring(2, expression.indexOf(";"));
        }
        return ",";
    }

}
