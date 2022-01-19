package players.mages;

import behaviours.IDefend;
import behaviours.ISpell;
import players.Player;

public abstract class Mage extends Player implements ISpell, IDefend {
    
    private ISpell spell;
    private IDefend familiar;
    
    public Mage(String name, ISpell spell, IDefend familiar){
        super(name);
        this.spell = spell;
        this.familiar = familiar;
    }
    
    
    
}
