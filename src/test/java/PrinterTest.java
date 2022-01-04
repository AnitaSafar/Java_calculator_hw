import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer myPrinter;

    @Before
    public void before(){
        myPrinter = new Printer(50);
    }

    @Test
    public void hasPaper(){
        assertEquals(50, myPrinter.getPaper());
    }

    @Test
    public void canPrint(){
    }
}
