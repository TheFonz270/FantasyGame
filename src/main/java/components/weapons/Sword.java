package components.weapons;

import behaviours.IWeapon;

public class Sword extends Weapons implements IWeapon {

    public Sword(String name, int damage){
        super(name, damage);
    }
}
