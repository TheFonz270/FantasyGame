package components.weapons;

import behaviours.IWeapon;

public class Club extends Weapons {

    public Club(String name, int damage){
        super(name, damage);
    }

    public int attack(){
        return 0;
    }
}
