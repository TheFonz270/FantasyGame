package components.spells;

import behaviours.ISpell;

public class Spell {

    private String name;
    private Element element;
    private int damage;

    public Spell(String name, Element element, int damage){
        this.name = name;
        this.element = element;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public Element getElement() {
        return element;
    }

    public int getDamage() {
        return damage;
    }
}
