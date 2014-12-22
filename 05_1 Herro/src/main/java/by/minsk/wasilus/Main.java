package by.minsk.wasilus;

/**
 * Created by Witold on 22.12.2014.
 */

public class Main {
    public static void main(String[] args) {
        Gnome gnome = new Gnome("Борис", 50, 1000, 3, 5, 11);
        MeleeWeapon blade = new MeleeWeapon("No name", "", Equipment.ClassHero.ASSASIN,
                Equipment.Uniqueness.CORE, 2, true);

        gnome.addMelleeWeapon(blade);

        Gnome gnome1 = new Gnome("Петр", 50, 1000, 3, 5, 15);
        MeleeWeapon bladeGnome = new MeleeWeapon("No name", "", Equipment.ClassHero.GNOME,
                Equipment.Uniqueness.CORE, 2, true);

        gnome1.addMelleeWeapon(bladeGnome);

        Battle battle = new Battle(gnome, gnome1);
        battle.setEvent(battle);
        for (int i = 0; i < 5; i++) {
            battle.strike(gnome, gnome1);
            System.out.println(gnome.toString());
            System.out.println(gnome1.toString());
        }


    }
}

