import com.sun.tools.corba.se.idl.constExpr.Divide;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator myCalculator;


    @Before
    public void before(){
        myCalculator = new Calculator(10, 5);
        //divideCalculator = new Calculator(40.88, 20.44);
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

    @Test
    public void canSubtract(){
        assertEquals(5, myCalculator.Subtract());
    }

    @Test
    public void canMultiply(){
        assertEquals(50, myCalculator.Multiply());
    }
}
