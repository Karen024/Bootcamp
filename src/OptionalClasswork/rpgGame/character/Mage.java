package OptionalClasswork.rpgGame.character;

import OptionalClasswork.rpgGame.equipment.Staff;
import OptionalClasswork.rpgGame.equipment.WandAndBuckler;
import OptionalClasswork.rpgGame.skills.MageSkill;

import java.util.Scanner;

public class Mage extends Character {


    public Mage() {
    }

    public void setCharacter() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Give name to character");
        String name = scn.next();
        setName(name);
        setAttributes();
        mageEquipmentMenu();
        int choice = scn.nextInt();
        while (choice != 1 && choice != 2) {
            System.out.println("Please choose you equipment 1 or 2");
            choice = scn.nextInt();
        }
        if (choice == 1) {
            giveStaff();
        } else {
            giveWandAndBuckler();
        }
    }

    private void mageEquipmentMenu() {
        System.out.println("Choose your equipment");
        System.out.println("1 - staff, energy boost, damage boost");
        System.out.println("2 - wand and buckler, energy boost, defense boost,damage boost");
    }

    public void attack(Character character) {
        character.receiveDamage(getDamage());
        System.out.println(getName() + " dealt " + getDamage() + " damage to " + character.getName());
    }

    public void receiveDamage(int damage) {
        setHealth(Math.max((getHealth() - damage), 0));
    }

    public void isStunned() {
        setStunState(true);
    }

    public int useSkill(Character character, int coolDown) {
        if (coolDown > 0) {
            return coolDown;
        }
        fireball(character);
        magicShield();
        return getSkill().getSkillCooldown();
    }

    private void magicShield() {
        if (getSkill().getSkillName().equals("Magic Shield")) {
            setEnergy(getEnergy() - getSkill().getSkillCost());
            setHealth(getHealth() + getSkill().getSkillDamage());
            System.out.println(getName() + " used Magic Shield ");
            System.out.println(getName() + " healed by " + getSkill().getSkillDamage() + " points");
        }
    }

    private void fireball(Character character) {
        if (getSkill().getSkillName().equals("Fireball")) {
            character.receiveDamage(getSkill().getSkillDamage());
            setEnergy(getEnergy() - getSkill().getSkillCost());
            System.out.println(getName() + " used Fireball on " + character.getName());
            System.out.println(character.getName() + " received " + getSkill().getSkillDamage() + " damage");
        }
    }

    private void giveWandAndBuckler() {
        WandAndBuckler equipment = new WandAndBuckler();
        equipment.changeStats(this);
        setSkill(MageSkill.createSkill(equipment));
        setEquipment(equipment);
    }

    private void giveStaff() {
        Staff equipment = new Staff();
        equipment.changeStats(this);
        setSkill(MageSkill.createSkill(equipment));
        setEquipment(equipment);
    }

    private void setAttributes() {
        setHealth(300);
        setEnergy(100);
        setDamage(50);
        setDefense(25);
        setStunState(false);
    }

    public static Mage getCharacter(Mage mage) {
        mage.setCharacter();
        return mage;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
