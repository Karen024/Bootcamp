package OptionalClasswork.rpgGame.character;

import OptionalClasswork.rpgGame.equipment.GreatSword;
import OptionalClasswork.rpgGame.equipment.SwordAndShield;
import OptionalClasswork.rpgGame.skills.WarriorSkill;

import java.util.Scanner;

public class Warrior extends Character {

    public Warrior() {
    }

    public void setCharacter() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Give name to character");
        String name = scn.next();
        setName(name);
        setAttributes();
        System.out.println("Choose your equipment");
        System.out.println("1 - greatsword, damage boost, defense penalty");
        System.out.println("2 - sword and shield, energy boost, defense boost, damage penalty");
        int choice = scn.nextInt();
        while (choice != 1 && choice != 2) {
            System.out.println("Please choose you equipment 1 or 2");
            choice = scn.nextInt();
        }
        if (choice == 1) {
            giveGreatsword();
        } else {
            giveSwordAndShield();
        }
    }

    public void attack(Character character) {
        character.receiveDamage(getDamage());
        System.out.println(getName() + " dealt " + getDamage() + " damage to " + character.getName());
    }

    public void isStunned() {
        setStunState(true);
    }

    public int useSkill(Character character, int coolDown) {
        if (coolDown > 0) {
            return coolDown;
        }
        if (getSkill().getSkillName().equals("Slice")) {
            character.receiveDamage(getSkill().getSkillDamage());
            setEnergy(getEnergy() - getSkill().getSkillCost());
            System.out.println(getName() + " used Slice on " + character.getName());
            System.out.println(character.getName() + " received " + getSkill().getSkillDamage() + " damage");
        }
        if (getSkill().getSkillName().equals("Stun")) {
            character.receiveDamage(getSkill().getSkillDamage());
            character.setStunState(true);
            setEnergy(getEnergy() - getSkill().getSkillCost());
            System.out.println(getName() + " used Stun on " + character.getName());
            System.out.println(character.getName() + " received " + getSkill().getSkillDamage() + " damage,and stunned");
        }
        return getSkill().getSkillCooldown();
    }

    public void receiveDamage(int damage) {
        setHealth(Math.max((getHealth() - damage), 0));
    }

    private void giveSwordAndShield() {
        SwordAndShield equipment = new SwordAndShield();
        equipment.changeStats(this);
        setSkill(WarriorSkill.createSkill(equipment));
        setEquipment(equipment);
    }

    private void giveGreatsword() {
        GreatSword equipment = new GreatSword();
        equipment.changeStats(this);
        setSkill(WarriorSkill.createSkill(equipment));
        setEquipment(equipment);
    }

    private void setAttributes() {
        setHealth(300);
        setEnergy(100);
        setDefense(50);
        setDamage(50);
        setStunState(false);
    }

    public static Warrior getCharacter(Warrior warrior) {
        warrior.setCharacter();
        return warrior;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
