package by.minsk.wasilus;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Witold on 22.12.2014.
 */

public class Hero implements Fight {
    private String name;
    private int hp;
    private int level;
    private int experience;
    private int def;
    private int melleeAttack;
    private int rangedAttack;
    private boolean meleeWeaponUsHand;//(true - one hand)
    private boolean ragedWeaponUsHand;
    private Equipment.ClassHero classHero;
    private List<MeleeWeapon> meleeWeaponList;
    private List<RangedWeapon> rangedWeaponList;
    private List<Armor> armors;

    public Hero(String name, int hp, int experience, int def, int melleeAttack, int rangedAttack,
                boolean meleeWeaponUsHand, boolean ragedWeaponUsHand, Equipment.ClassHero classHero) {
        this.name = name;
        this.hp = hp;
        level = experience / 1000;
        this.experience = experience;
        this.def = def;
        this.melleeAttack = melleeAttack;
        this.rangedAttack = rangedAttack;
        this.meleeWeaponUsHand = meleeWeaponUsHand;
        this.ragedWeaponUsHand = ragedWeaponUsHand;
        this.classHero = classHero;
        meleeWeaponList = new ArrayList<MeleeWeapon>();
        rangedWeaponList = new ArrayList<RangedWeapon>();
        armors = new ArrayList<Armor>();
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
        setLevel(experience / 1000);
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void receiveExperience(int experience) {
        setExperience(getExperience() + experience);
        setLevel(experience / 1000);
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getMelleeAttack() {
        return melleeAttack;
    }

    public void setMelleeAttack(int melleeAtack) {
        this.melleeAttack = melleeAtack;
    }

    public int getRangedAttack() {
        return rangedAttack;
    }

    public void setRangedAttack(int rangedAttack) {
        this.rangedAttack = rangedAttack;
    }

    public void dellHp(int hp) {
        if (getHp() - hp >= 0) {
            setHp(getHp() - hp);
        } else {
            setHp(0);
        }
    }

    public void receiveDamage(int damage) {
        if (getDef() - damage > 0) {
            dellHp(getDef() - damage);
        }
    }

    public void addHp(int hp) {
        setHp(getHp() + hp);
    }

    public void addMelleeWeapon(MeleeWeapon meleeWeapon) {
        if (meleeWeapon.getClassHero() == getClassHero()) {
            setMelleeAttack(getMelleeAttack() + meleeWeapon.getMelleeAttack());
            meleeWeaponList.add(meleeWeapon);
        }
    }

    public void dellMelleeWeapon(MeleeWeapon meleeWeapon) {
        setMelleeAttack(getMelleeAttack() - meleeWeapon.getMelleeAttack());
    }

    public void addRangedWeapon(RangedWeapon rangedWeapon) {
        setRangedAttack(getRangedAttack() + rangedWeapon.getRangedAttack());
        rangedWeaponList.add(rangedWeapon);
    }

    public void dellRangedWeapon(RangedWeapon rangedWeapon) {
        setRangedAttack(getRangedAttack() - rangedWeapon.getRangedAttack());
    }

    public boolean isMeleeWeaponUsHand() {
        return meleeWeaponUsHand;
    }

    public void setMeleeWeaponUsHand(boolean meleeWeaponUsHand) {
        this.meleeWeaponUsHand = meleeWeaponUsHand;
    }

    public boolean isRagedWeaponUsHand() {
        return ragedWeaponUsHand;
    }

    public void setRagedWeaponUsHand(boolean ragedWeaponUsHand) {
        this.ragedWeaponUsHand = ragedWeaponUsHand;
    }

    public Equipment.ClassHero getClassHero() {
        return classHero;
    }

    public List<MeleeWeapon> getMeleeWeaponList() {
        return meleeWeaponList;
    }

    public void setMeleeWeaponList(List<MeleeWeapon> meleeWeaponList) {
        this.meleeWeaponList = meleeWeaponList;
    }

    public List<RangedWeapon> getRangedWeaponList() {
        return rangedWeaponList;
    }

    public void setRangedWeaponList(List<RangedWeapon> rangedWeaponList) {
        this.rangedWeaponList = rangedWeaponList;
    }

    public boolean deadHero() {
        if (getHp() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void addArmor(Armor armor) {
        setDef(getDef() + armor.getDef());
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", level=" + level +
                ", experience=" + experience +
                ", def=" + def +
                ", melleeAttack=" + melleeAttack +
                ", rangedAttack=" + rangedAttack +
                ", meleeWeaponUsHand=" + meleeWeaponUsHand +
                ", ragedWeaponUsHand=" + ragedWeaponUsHand +
                '}';
    }


}

