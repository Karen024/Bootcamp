package OptionalClasswork.RpgGame.Character;

import OptionalClasswork.RpgGame.Equipment.Bow;
import OptionalClasswork.RpgGame.Equipment.DualDaggers;
import OptionalClasswork.RpgGame.Skills.AssassinSkill;

import java.util.Scanner;

public class Assassin extends Character {


    public Assassin() {
    }

    public void setCharacter() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Give name to character");
        String name = scn.next();
        setName(name);
        setHealth(300);
        setEnergy(100);
        setDamage(50);
        setDefense(35);
        System.out.println("Choose your equipment");
        System.out.println("1 - bow, damage boost,energy boost, defense penalty");
        System.out.println("2 - dual daggers, defense boost, energy boost");
        int choice = scn.nextInt();
        while (choice != 1 && choice != 2) {
            System.out.println("Please choose you equipment 1 or 2");
            choice = scn.nextInt();
        }
        if (choice == 1) {
            Bow equipment = new Bow();
            equipment.changeStats(this);
            setSkill(AssassinSkill.createSkill(equipment));
            setEquipment(equipment);
        } else {
            DualDaggers equipment = new DualDaggers();
            equipment.changeStats(this);
            setSkill(AssassinSkill.createSkill(equipment));
            setEquipment(equipment);
        }
    }

    public static Assassin getCharacter(Assassin assassin) {
        assassin.setCharacter();
        return assassin;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
