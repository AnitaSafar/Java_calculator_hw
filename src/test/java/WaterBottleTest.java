import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle water;

    @Before
    public void before(){
        water = new WaterBottle(100);
    }

    @Test
    public void canDrink(){
        assertEquals(90, water.drink());

    }
}
