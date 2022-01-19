package players;

import components.weapons.Axe;
import components.weapons.Sword;
import org.junit.Before;
import org.junit.Test;
import players.fighters.Champion;

import static org.junit.Assert.assertEquals;

public class FighterTest {
    private Sword broadsword;
    private Axe grimnir;
    private Champion william;

    @Before
    public void before(){
        broadsword = new Sword ("Broadsword", 10);
        grimnir = new Axe("Grimnir", 12);
        william = new Champion("William", broadsword);
    }

    @Test
    public void PlayerExists(){
        assertEquals("William", william.getName());
        assertEquals("Broadsword", william.getWeapon().getName());
        assertEquals(10, william.getWeapon().getDamage());
    }
    
    @Test
    public void FighterCanChangeWeapons(){
        assertEquals("William", william.getName());
        assertEquals("Broadsword", william.getWeapon().getName());
        william.changeWeapon(grimnir);
        assertEquals("Grimnir", william.getWeapon().getName());
    }
}
