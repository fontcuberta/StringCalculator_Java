import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Tests{

    // 1 -> 1
    // 1,1 -> 2
    // 1,1,1 -> 3
    // 1,a -> 1
    // a -> 0
    // //#;1#1 -> 2


    @Test
    void it_should_parse_to_int_when_String_have_one_element(){
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
    }

    private int sumNumbersFrom(String expression) {

        String[] numbers = expression.split(",");

        return Arrays.stream(numbers)
                .filter(number -> number.matches("\\d"))
                .mapToInt(Integer::parseInt)
                .sum();
    }

}
