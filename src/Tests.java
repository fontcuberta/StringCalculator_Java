import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests{
    public int stringCalculator (String x){
        String[] y = x.split(",");

        if (y.length == 2){
            return Integer.parseInt(y[0]) + Integer.parseInt(y[1]);
        }

        if (y.length == 3){
            return Integer.parseInt(y[0]) + Integer.parseInt(y[1])+ Integer.parseInt(y[2]);
        }
        return Integer.parseInt(x);
    }

    @Test
    public void itShouldReturnAnIntegerWhenGivenOneNumberAsString(){
        assertEquals(stringCalculator("1"), 1);

    }

    @Test
    public void itShouldReturnTheAdditionOfTwoNumbersAsString(){
        assertEquals(stringCalculator("1,1"), 2);
        assertEquals(stringCalculator("1,2"), 3);
    }

    @Test
    public void itShouldReturnTheAdditionOfThreeNumbersAsString(){
        assertEquals(stringCalculator("1,1,1"), 3);
        assertEquals(stringCalculator("1,2,3"), 6);
    }

}
