package players;

import components.weapons.Axe;
import org.junit.Before;
import org.junit.Test;
import players.fighters.Barbarian;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
    private Axe axe;
    private Barbarian brian;

    @Before
    public void before(){
        axe = new Axe ("axe", 8);
        brian = new Barbarian("Brian", axe);
    }

    @Test
    public void PlayerExists(){
        assertEquals("Brian", brian.getName());
        assertEquals(axe, brian.getWeapon());
        assertEquals(8, brian.getWeapon().getDamage());
    }



}
