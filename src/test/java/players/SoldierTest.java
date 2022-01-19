package players;

import components.weapons.Club;
import components.weapons.Sword;
import org.junit.Before;
import org.junit.Test;
import players.fighters.Champion;
import players.fighters.Soldier;

import static org.junit.Assert.assertEquals;

public class SoldierTest {
    private Club ironClub;
    private Soldier harry;

    @Before
    public void before(){
        ironClub = new Club ("Iron Club", 10);
        harry = new Soldier("Harry", ironClub);
    }

    @Test
    public void PlayerExists(){
        assertEquals("Harry", harry.getName());
        assertEquals("Iron Club", harry.getWeapon().getName());
        assertEquals(10, harry.getWeapon().getDamage());
    }
}
