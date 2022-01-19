package enemies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoblinTest {

    private Goblin goblin;

    @Before
    public void before(){
        goblin = new Goblin(25);
    }

    @Test
    public void goblinExists(){
        assertEquals(25, goblin.getHp());
    }
}
