package OptionalClasswork.RpgGame.Character;

import OptionalClasswork.RpgGame.Equipment.GreatSword;
import OptionalClasswork.RpgGame.Equipment.SwordAndShield;
import OptionalClasswork.RpgGame.Equipment.WarriorEquipment;
import OptionalClasswork.RpgGame.Skills.WarriorSkill;

import java.util.Scanner;

public class Warrior extends Character {

    public Warrior(String name, int health, int energy, int defense, int damage, WarriorEquipment equipment, WarriorSkill skill) {
        super(name, health, energy, defense, damage, equipment, skill);
    }

    public Warrior() {
    }

    public void setCharacter() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Give name to character");
        String name = scn.next();
        setName(name);
        setHealth(300);
        setEnergy(100);
        setDefense(50);
        setDamage(50);
        System.out.println("Choose your equipment");
        System.out.println("1 - greatsword, ++damage, --defense");
        System.out.println("2 - sword and shield, +energy, +damage, -high defense");
        int choice = scn.nextInt();
        if (choice == 1) {
            GreatSword equipment = new GreatSword();
            equipment.changeStats(this);
            setSkill(WarriorSkill.createSkill(equipment));
            setEquipment(equipment);
        } else if (choice == 2) {
            SwordAndShield equipment = new SwordAndShield();
            equipment.changeStats(this);
            setSkill(WarriorSkill.createSkill(equipment));
            setEquipment(equipment);
        } else {
            System.out.println("Wrong input, fight naked");
        }
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
