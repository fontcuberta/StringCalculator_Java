import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests{

    @Test
    public void it_should_parse_to_int_when_String_have_one_element (){
        assertEquals(sumNumbersFrom("1"), 1);
    }

    private int sumNumbersFrom(String expression) {
        return 0;
    }


}
