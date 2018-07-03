import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests{
    public int stringCalculator (String x){
        String[] y = x.split(",");

        if (x.length()>1){
            return Integer.parseInt(y[0]) + Integer.parseInt(y[1]);
        }
        return Integer.parseInt(x);
    }

    @Test
    public void itShouldReturnAnIntegerWhenGivenOneNumberAsString(){
        assertEquals(stringCalculator("1"), 1);

    }

    @Test
    public void itShouldReturnTheAdditionOfTwoNumberAsString(){
        assertEquals(stringCalculator("1,1"), 2);
        assertEquals(stringCalculator("1,2"), 3);

    }
}
