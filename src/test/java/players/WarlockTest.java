package players;

import behaviours.IDefend;
import behaviours.ISpell;
import components.familiars.Imp;
import components.spells.Element;
import components.spells.Spell;
import org.junit.Before;
import org.junit.Test;
import players.mages.Warlock;

import static org.junit.Assert.assertEquals;


public class WarlockTest {

    private Spell fireball;
    private Imp impy;
    private Warlock dimitri;

    @Before
    public void before(){
        fireball = new Spell("Fireball", Element.FIRE, 15);
        impy = new Imp("Impy", 20);
        dimitri = new Warlock("Dimitri", fireball, impy);
    }

    @Test
    public void warlockExists(){
        assertEquals("Dimitri", dimitri.getName());
        assertEquals("Impy", dimitri.getFamiliar().getName());
        assertEquals("Fireball", dimitri.getSpell().getName());
    }

    @Test
    public void warlockCanCast(){
        assertEquals(15, dimitri.cast(fireball));
    }

    @Test
    public void warlockFamiliarCanDefend(){
        assertEquals(100, dimitri.getHp());
        assertEquals(20, dimitri.getFamiliar().getHp());
        dimitri.getFamiliar().defend(5);
        assertEquals(100, dimitri.getHp());
        assertEquals(15, dimitri.getFamiliar().getHp());
    }



}
