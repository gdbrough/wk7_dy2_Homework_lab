import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GozillaTest {

    private Godzilla godzilla;
    private Tank tank;

    @Before
    public void setUp() {
        godzilla = new Godzilla("Gozilla", 10, 3);
        tank = new Tank("Tanky McTankFace", 7, 6);
    }
    
    @Test
    public void testCanGetName(){
        assertEquals("Gozilla", godzilla.getName());
    }

    @Test
    public void testCanGetHealthValue() {
        assertEquals(10, godzilla.getHealthValue());
    }

    @Test
    public void testCanGetAttackValue() {
        assertEquals(3, godzilla.getAttackValue());
    }

    @Test
    public void testCanAttackArmy() {
        assertEquals(3, godzilla.attackArmy());
    }

    @Test
    public void testHealthValueIsReducedAfterArmyAttach(){
        assertEquals(4, godzilla.incomingAttack(tank));
    }



}
