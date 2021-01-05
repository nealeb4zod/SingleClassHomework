import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void setUp(){
        waterBottle = new WaterBottleBuilder().createWaterBottle();
    }

    @Test
    public void checkInitialVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drinkFromBottleTest(){
        waterBottle.drinkFromBottle();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void emptyBottleTest(){
        waterBottle.emptyBottle();
        assertEquals(0, waterBottle.getVolume());
    }
    @Test
    public void fillBottleTest(){
        waterBottle.fillBottle();
        assertEquals(100, waterBottle.getVolume());
    }
}

