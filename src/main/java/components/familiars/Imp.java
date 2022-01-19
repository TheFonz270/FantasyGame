package components.familiars;


import behaviours.IDefend;

public class Imp extends Familiars implements IDefend {

    public Imp(String name, int hp){
        super(name, hp);
    }

    @Override
    public void defend() {

    }

}
