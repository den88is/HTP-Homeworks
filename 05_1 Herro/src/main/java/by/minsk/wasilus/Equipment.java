package by.minsk.wasilus;

/**
 * Created by Witold on 22.12.2014.
 */

public class Equipment {
    enum ClassHero {GNOME, GLADIATOR, ASSASIN, MAGICIAN}
    enum Uniqueness {RARE, SPECIAL, CORE}

    private String name;
    private String description;
    private ClassHero classHero;
    private Uniqueness uniqueness;

    public Equipment(String name, String description, ClassHero classHero, Uniqueness uniqueness) {
        this.name = name;
        this.description = description;
        this.classHero = classHero;
        this.uniqueness = uniqueness;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ClassHero getClassHero() {
        return classHero;
    }

    public Uniqueness getUniqueness() {
        return uniqueness;
    }
}

