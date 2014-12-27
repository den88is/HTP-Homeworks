package by.minsk.wasilus;

/**
 * Created by Witold on 22.12.2014.
 */
public class Armor extends Equipment {
    private int def;

    public Armor(String name, String description, ClassHero classHero, Uniqueness uniqueness, int def) {
        super(name, description, classHero, uniqueness);
        this.def = def;
    }

    public int getDef() {
        return def;
    }
}

