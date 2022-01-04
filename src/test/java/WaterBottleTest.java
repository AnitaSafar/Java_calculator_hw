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
    public void bottleNotEmpty(){
        assertEquals(100, water.notEmpty());
    }

    @Test
    public void canDrink(){
        assertEquals(90, water.drink());
    }

    @Test
    public void bottleIsEmpty(){
        assertEquals(0, water.empty());
    }

    @Test
    public void bottleIsFilled(){
        assertEquals(100, water.fill());
    }
}
