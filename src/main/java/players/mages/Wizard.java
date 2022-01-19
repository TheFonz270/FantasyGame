package players.mages;

import behaviours.IDefend;
import behaviours.ISpell;

public class Wizard extends Mage{

        public Wizard(String name, ISpell spell, IDefend familiar){
            super(name, spell, familiar);
        }

        public int cast() {
            return 6;
        }

        public void defend() {

        }
        
}
