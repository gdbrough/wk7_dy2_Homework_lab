import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TankTest {

    private Tank tank;
    private KingKong kingKong;

    @Before
    public void setUp() {
        tank = new Tank("Tanky McTankFace", 30, 10);
        kingKong = new KingKong("King Kong", 20, 7);
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

    @Test
    public void testCanAttackMonster() {
        assertEquals(10, tank.attackMonster());
    }

    @Test
    public void testHealthValueIsReducedAfterMonsterAttach(){
        assertEquals(23, tank.incomingAttack(kingKong));
    }



}
