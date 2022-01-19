package players.healers;

import behaviours.IHeal;
import players.Player;

public abstract class Healer extends Player implements IHeal {

    private IHeal healingItem;

    public Healer(String name, IHeal healingItem){
        super(name);
        this.healingItem = healingItem;
    }

}
