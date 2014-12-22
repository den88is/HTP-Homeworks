package by.minsk.wasilus;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Witold on 22.12.2014.
 */

public class Battle implements Event {
    private int distance;
    private Event event;
    private int hp;
    private String name;

    public Battle(Hero hero1, Hero hero2) {
        Random random = new Random();
        distance = random.nextInt(5) + 5;
        ;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void strike(Fight hero1, Fight hero2) {
        if (distance > 0) {
            if (hero2.getHp() - hero1.getRangedAttack() > 0) {
                hero2.setHp(hero2.getHp() - hero1.getRangedAttack());
            } else {
                hero2.setHp(0);
            }
        } else {
            if (hero2.getHp() - hero1.getMelleeAttack() > 0) {
                hero2.setHp(hero2.getHp() - hero1.getMelleeAttack());
            } else {
                hero2.setHp(0);
            }
        }
        setHp(hero2.getHp());
        setName(hero2.getName());
        event.onDeath();
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public void onDeath() {
        if (getHp() <= 0) {
            System.out.println("Клиент -" + getName() + "- ПОМЕР!!!");
        }
    }
}

