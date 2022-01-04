import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator myCalculator;
    @Before
    public void before(){
        myCalculator = new Calculator(10, 5);
    }

    @Test
    public void hasFirstNumber(){
        assertEquals(10, myCalculator.getFirstNumber());
    }

    @Test
    public void hasSecondNumber(){
        assertEquals(5, myCalculator.getSecondNumber());
    }

    @Test
    public void canAdd(){
        assertEquals(15, myCalculator.Add());
    }
}
