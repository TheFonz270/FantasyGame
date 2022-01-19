package players.fighters;

import behaviours.IWeapon;
import components.weapons.Weapons;
import enemies.Enemy;
import players.Player;

public abstract class Fighter extends Player {

    private IWeapon weapon;
    private IWeapon newWeapon;

    public Fighter(String name, behaviours.IWeapon weapon) {
        super(name);
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public int attack(){
        return weapon.getDamage();
    }

    public void changeWeapon(IWeapon newWeapon){
        this.weapon = newWeapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }
}
