package OptionalClasswork.RpgGame.Character;

import OptionalClasswork.RpgGame.Equipment.AssassinEquipment;
import OptionalClasswork.RpgGame.Equipment.Bow;
import OptionalClasswork.RpgGame.Equipment.DualDaggers;
import OptionalClasswork.RpgGame.Skills.AssassinSkill;

import java.util.Scanner;

public class Assassin extends Character {


    public Assassin(String name, int health, int energy, int defense, int damage, AssassinEquipment equipment, AssassinSkill skill) {
        super(name, health, energy, defense, damage, equipment, skill);
    }

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
        System.out.println("1 - bow, high damage, medium defense");
        System.out.println("2 - dual daggers, high damage, low defense");
        int choice = scn.nextInt();
        if (choice == 1) {
            Bow equipment = new Bow();
            equipment.changeStats(this);
            setSkill(AssassinSkill.createSkill(equipment));
            setEquipment(equipment);
        } else if (choice == 2) {
            DualDaggers equipment = new DualDaggers();
            equipment.changeStats(this);
            setSkill(AssassinSkill.createSkill(equipment));
            setEquipment(equipment);
        } else {
            System.out.println("Wrong input, fight naked");
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
