package players.fighters;

import behaviours.IWeapon;
import enemies.Enemy;
import players.Player;

public abstract class Fighter extends Player {

    private IWeapon weapon;

    public Fighter(String name, behaviours.IWeapon weapon) {
        super(name);
        this.weapon = weapon;
    }

    public void attack(){

    }

    public void changeWeapon(){

    }
}
