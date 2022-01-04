import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator myCalculator;
    @Before
    public void before(){
        myCalculator = new Calculator(10);
    }

    @Test
    public void hasFirstNumber(){
        assertEquals(10, myCalculator.getFirstNumber());
    }
}
