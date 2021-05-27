package OptionalClasswork.rpgGame.character;

import OptionalClasswork.rpgGame.equipment.Bow;
import OptionalClasswork.rpgGame.equipment.DualDaggers;
import OptionalClasswork.rpgGame.skills.AssassinSkill;

import java.util.Random;
import java.util.Scanner;

public class Assassin extends Character {
    private boolean criticalState = false;


    public Assassin() {
    }

    public void setCharacter() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Give name to character");
        String name = scn.next();
        setName(name);
        setAttributes();
        System.out.println("Choose your equipment");
        System.out.println("1 - bow, damage boost,energy boost, defense penalty");
        System.out.println("2 - dual daggers, defense boost, energy boost");
        int choice = scn.nextInt();
        while (choice != 1 && choice != 2) {
            System.out.println("Please choose you equipment 1 or 2");
            choice = scn.nextInt();
        }
        if (choice == 1) {
            giveBow();
        } else {
            giveDaggers();
        }
    }

    public boolean isCriticalState() {
        return criticalState;
    }

    public void setCriticalState(boolean criticalState) {
        this.criticalState = criticalState;
    }

    private void setAttributes() {
        setHealth(300);
        setEnergy(100);
        setDamage(50);
        setDefense(35);
        setStunState(false);
    }

    private void giveDaggers() {
        DualDaggers equipment = new DualDaggers();
        equipment.changeStats(this);
        setSkill(AssassinSkill.createSkill(equipment));
        setEquipment(equipment);
    }

    private void giveBow() {
        Bow equipment = new Bow();
        equipment.changeStats(this);
        setSkill(AssassinSkill.createSkill(equipment));
        setEquipment(equipment);
    }

    public static Assassin getCharacter(Assassin assassin) {
        assassin.setCharacter();
        return assassin;
    }

    public void isStunned() {
        setStunState(true);
    }

    public void attack(Character character) {
        character.receiveDamage(getDamage());
        System.out.println(getName() + " dealt " + getDamage() + " damage to " + character.getName());
    }

    public void receiveDamage(int damage) {
        setHealth(Math.max((getHealth() - damage), 0));
    }

    public int useSkill(Character character, int coolDown) {
        if (coolDown > 0) {
            return coolDown;
        }
        Random rnd = new Random();
        if (getSkill().getSkillName().equals("Triple Shot")) {
            int damage = (getDamage() * 3) - rnd.nextInt(10) + 1;
            character.receiveDamage(damage);
            setEnergy(getEnergy() - getSkill().getSkillCost());
            System.out.println(getName() + " used Triple Shot on " + character.getName());
            System.out.println(character.getName() + " received " + damage + " damage");
        }
        if (getSkill().getSkillName().equals("Prepare Critical")) {
            setCriticalState(true);
            setEnergy(getEnergy() - getSkill().getSkillCost());
            System.out.println(getName() + " used Prepare Critical on " + character.getName());
        }
        return getSkill().getSkillCooldown();
    }

    public void attackCritical(Character character) {
        Random rnd = new Random();
        character.receiveDamage(getDamage() * 3 - rnd.nextInt(10) + 1);
        System.out.println(getName() + " dealt " + getDamage() + " damage to " + character.getName());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
