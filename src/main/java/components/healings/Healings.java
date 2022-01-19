package components.healings;

public abstract class Healings {

    private String name;
    private int hpRestored;
    private int value;

    public Healings(String name, int hpRestored, int value){
        this.name = name;
        this.hpRestored = hpRestored;
        this.value = value;
    }
}
