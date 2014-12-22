package by.minsk.wasilus;

/**
 * Created by Witold on 22.12.2014.
 */
public class Assasin extends Hero implements Fight {
      public Assasin(String name, int hp, int experience, int def, int melleeAtack, int rangedAttack,
                       boolean meleeWeaponUsHand, boolean ragedWeaponUsHand, Equipment.ClassHero classHero) {
            super(name, hp, experience, def, melleeAtack, rangedAttack, meleeWeaponUsHand, ragedWeaponUsHand, classHero);
        }

        @Override
        public void receiveExperience(int experience) {
            super.receiveExperience(experience + 3);
        }

        @Override
        public void setMelleeAttack(int melleeAtack) {
            super.setMelleeAttack(melleeAtack + 5);
        }

        @Override
        public void setRangedAttack(int rangedAttack) {
            super.setRangedAttack(rangedAttack + 5);
        }

    }