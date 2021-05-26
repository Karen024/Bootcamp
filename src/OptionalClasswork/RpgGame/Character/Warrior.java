package OptionalClasswork.RpgGame.Character;

import OptionalClasswork.RpgGame.Equipment.GreatSword;
import OptionalClasswork.RpgGame.Equipment.SwordAndShield;
import OptionalClasswork.RpgGame.Skills.WarriorSkill;

import java.util.Scanner;

public class Warrior extends Character {

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
        System.out.println("1 - greatsword, damage boost, defense penalty");
        System.out.println("2 - sword and shield, energy boost, defense boost, damage penalty");
        int choice = scn.nextInt();
        while (choice != 1 && choice != 2) {
            System.out.println("Please choose you equipment 1 or 2");
            choice = scn.nextInt();
        }
        if (choice == 1) {
            GreatSword equipment = new GreatSword();
            equipment.changeStats(this);
            setSkill(WarriorSkill.createSkill(equipment));
            setEquipment(equipment);
        } else {
            SwordAndShield equipment = new SwordAndShield();
            equipment.changeStats(this);
            setSkill(WarriorSkill.createSkill(equipment));
            setEquipment(equipment);
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
