package players.mages;

import behaviours.IDefend;
import behaviours.ISpell;
import components.spells.Spell;

public class Wizard extends Mage{

        public Wizard(String name, Spell spell, IDefend familiar){
            super(name, spell, familiar);
        }

        public int cast() {
            return 6;
        }

        public void defend() {

        }
        
}
