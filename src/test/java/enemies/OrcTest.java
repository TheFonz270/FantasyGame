package enemies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class OrcTest {

    private Orc orc;

    @Before
    public void before(){
        orc = new Orc(20);
    }

    @Test
    public void orcExists(){
        assertEquals(20, orc.getHp());
    }
}
