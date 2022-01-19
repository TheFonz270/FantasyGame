package players.mages;

import behaviours.IDefend;
import behaviours.ISpell;

public class Warlock extends Mage{

    public Warlock(String name, ISpell spell, IDefend familiar){
        super(name, spell, familiar);
    }

    public int cast() {
       return 4;
    }

    public void defend() {

    }
}
