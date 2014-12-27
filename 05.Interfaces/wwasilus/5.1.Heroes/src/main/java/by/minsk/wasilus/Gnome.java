package by.minsk.wasilus;

/**
 * Created by Witold on 22.12.2014.
 */

    public class Gnome extends Hero implements Fight {

            public Gnome(String name, int hp, int experience, int def, int melleeAtack, int rangedAttack) {
                super(name, hp, experience, def, melleeAtack, rangedAttack, false, true, Equipment.ClassHero.GNOME);
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
            public void receiveDamage(int damage) {
                super.receiveDamage(damage - 1);
           }

            @Override
            public void receiveExperience(int experience) {
                super.receiveExperience(experience - 5);
            }

            @Override
            public String toString() {
                return "Gnome{}" + super.toString();
            }
        }

