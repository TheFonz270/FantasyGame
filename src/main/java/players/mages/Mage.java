package players.mages;

import behaviours.IDefend;
import behaviours.ISpell;
import components.spells.Spell;
import players.Player;

public abstract class Mage extends Player implements ISpell {
    
    private Spell spell;
    private IDefend familiar;
    
    public Mage(String name, Spell spell, IDefend familiar){
        super(name);
        this.spell = spell;
        this.familiar = familiar;
    }

    public Spell getSpell() {
        return spell;
    }

    public IDefend getFamiliar() {
        return familiar;
    }

    public int cast(Spell spell){
        return spell.getDamage();
    }
}
