package players.mages;

import behaviours.IDefend;
import behaviours.ISpell;
import components.spells.Spell;

public class Warlock extends Mage{

    public Warlock(String name, Spell spell, IDefend familiar){
        super(name, spell, familiar);
    }



    public int cast() {
       return 4;
    }

    public void defend() {
    }


}
