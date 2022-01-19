package players.healers;

import behaviours.IHeal;

public class Chemist extends Healer{

    public Chemist(String name, IHeal potion){
        super(name, potion);
    }

    public int heal(){
        return 10;
    }
}
