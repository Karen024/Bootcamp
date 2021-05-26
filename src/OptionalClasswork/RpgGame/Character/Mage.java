package OptionalClasswork.RpgGame.Character;

import OptionalClasswork.RpgGame.Equipment.Staff;
import OptionalClasswork.RpgGame.Equipment.WandAndBuckler;
import OptionalClasswork.RpgGame.Skills.MageSkill;

import java.util.Scanner;

public class Mage extends Character {


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
        System.out.println("1 - staff, energy boost, damage boost");
        System.out.println("2 - wand and buckler, energy boost, defense boost,damage boost");
        int choice = scn.nextInt();
        while (choice != 1 && choice != 2) {
            System.out.println("Please choose you equipment 1 or 2");
            choice = scn.nextInt();
        }
        if (choice == 1) {
            Staff equipment = new Staff();
            equipment.changeStats(this);
            setSkill(MageSkill.createSkill(equipment));
            setEquipment(equipment);
        } else {
            WandAndBuckler equipment = new WandAndBuckler();
            equipment.changeStats(this);
            setSkill(MageSkill.createSkill(equipment));
            setEquipment(equipment);
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
