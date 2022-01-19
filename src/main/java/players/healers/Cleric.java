package players.healers;

import behaviours.IHeal;

public class Cleric extends Healer{

    public Cleric(String name, IHeal prayer){
        super(name, prayer);
    }

    public int heal(){
        return 10;
    }

}
