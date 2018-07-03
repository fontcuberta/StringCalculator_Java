import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCalculatorTest {

    private StringCalculator stringCalculator;

    // 1 -> 1
    // 1,1 -> 2
    // 1,1,1 -> 3
    // 1,a -> 1
    // a -> 0
    // //#;1#1 -> 2

    @BeforeEach
    void setup() {
        stringCalculator = new StringCalculator();
    }

    @Test
    void it_should_parse_to_int_when_String_have_one_element() {
        assertEquals(stringCalculator.sumNumbersFrom("1"), 1);
        assertEquals(stringCalculator.sumNumbersFrom("2"), 2);
    }

    @Test
    void it_should_parse_to_int_when_string_have_a_comma() {
        assertEquals(stringCalculator.sumNumbersFrom("1,1"), 2);
        assertEquals(stringCalculator.sumNumbersFrom("1,1,1"), 3);
    }

    @Test
    void it_should_only_add_numbers() {
        assertEquals(stringCalculator.sumNumbersFrom("a"), 0);
        assertEquals(stringCalculator.sumNumbersFrom("a,b"), 0);
        assertEquals(stringCalculator.sumNumbersFrom("a,1"), 1);
    }

    @Test
    void it_should_add_numbers_using_custom_separator() {
        assertEquals(stringCalculator.sumNumbersFrom("//#;1#1"), 2);
    }

}
