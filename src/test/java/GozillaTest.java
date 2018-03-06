import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GozillaTest {

    private Godzilla godzilla;

    @Before
    public void setUp() {
        godzilla = new Godzilla("Gozilla", 10, 3);
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
}
