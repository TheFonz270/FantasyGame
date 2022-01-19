package behaviours;

import components.weapons.Sword;
import components.weapons.Weapons;

public interface IWeapon {

    public String getName();
    public int getDamage();
    public int attack();
}
