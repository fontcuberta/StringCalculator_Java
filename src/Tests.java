import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests{
    public int stringCalculator (String x){
        return Integer.parseInt(x);
    }

    @Test
    public void itShouldReturnAnIntegerWhenGivenOneNumberAsString(){
        assertEquals(stringCalculator("1"), 1);
    }

}
