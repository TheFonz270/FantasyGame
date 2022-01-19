package components.weapons;

import behaviours.IWeapon;

public class Club extends Weapons implements IWeapon {

    public Club(String name, int damage){
        super(name, damage);
    }
}
