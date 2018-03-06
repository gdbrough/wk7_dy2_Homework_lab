import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TankTest {

    private Tank tank;

    @Before
    public void setUp() {
        tank = new Tank("Tanky McTankFace", 30, 10);
    }

    @Test
    public void testCanGetName(){
        assertEquals("Tanky McTankFace", tank.getName());
    }

    @Test
    public void testCanGetHealthValue() {
        assertEquals(30, tank.getHealthValue());
    }

    @Test
    public void testCanGetAttackValue() {
        assertEquals(10, tank.getAttackValue());
    }



}
