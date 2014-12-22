package by.minsk.wasilus;

/**
 * Created by Witold on 22.12.2014.
 */

public class Gladiator extends Hero implements Fight {

    public Gladiator(String name, int hp, int experience, int def, int melleeAtack, int rangedAttack) {
        super(name, hp, experience, def, melleeAtack, rangedAttack, true, false, Equipment.ClassHero.GLADIATOR);
    }

    @Override
    public void addHp(int hp) {
        super.addHp(hp + 1);
    }

    @Override
    public void dellHp(int hp) {
        super.dellHp(hp - 1);
    }

    @Override
    public void receiveExperience(int experience) {
        super.receiveExperience(experience - 1);
    }
}

