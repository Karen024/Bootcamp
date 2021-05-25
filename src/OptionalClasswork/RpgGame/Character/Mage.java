package OptionalClasswork.RpgGame.Character;

import OptionalClasswork.RpgGame.Equipment.MageEquipment;
import OptionalClasswork.RpgGame.Equipment.Staff;
import OptionalClasswork.RpgGame.Equipment.WandAndBuckler;
import OptionalClasswork.RpgGame.Skills.MageSkill;

import java.util.Scanner;

public class Mage extends Character {

    public Mage(String name, int health, int energy, int defense, int damage, MageEquipment equipment, MageSkill skill) {
        super(name, health, energy, defense, damage, equipment, skill);
    }

    public Mage() {
    }

    public void setCharacter() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Give name to character");
        String name = scn.next();
        setName(name);
        setHealth(300);
        setEnergy(100);
        setDamage(50);
        setDefense(25);
        System.out.println("Choose your equipment");
        System.out.println("1 - staff, high damage, medium defense");
        System.out.println("2 - wand and buckler, high damage, low defense");
        int choice = scn.nextInt();
        if (choice == 1) {
            Staff equipment = new Staff();
            equipment.changeStats(this);
            setSkill(MageSkill.createSkill(equipment));
            setEquipment(equipment);
        } else if (choice == 2) {
            WandAndBuckler equipment = new WandAndBuckler();
            equipment.changeStats(this);
            setSkill(MageSkill.createSkill(equipment));
            setEquipment(equipment);
        } else {
            System.out.println("Wrong input, fight naked");
        }
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
