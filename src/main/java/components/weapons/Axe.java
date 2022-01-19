package components.weapons;

import behaviours.IWeapon;

public class Axe extends Weapons implements IWeapon {

    public Axe(String name, int damage){
        super(name, damage);
    }
}
