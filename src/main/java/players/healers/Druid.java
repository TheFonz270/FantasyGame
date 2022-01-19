package players.healers;

import behaviours.IHeal;

public class Druid extends Healer{

    public Druid(String name, IHeal herb){
        super(name, herb);
    }

    public int heal(){
        return 10;
    }

}
