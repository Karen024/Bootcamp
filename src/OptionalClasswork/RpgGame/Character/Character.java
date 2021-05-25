package OptionalClasswork.RpgGame.Character;


import OptionalClasswork.RpgGame.Equipment.Equipment;
import OptionalClasswork.RpgGame.Skills.Skill;

public abstract class Character {
    private String name;
    private int health;
    private int energy;
    private int defense;
    private int damage;
    private Skill skill;
    private Equipment equipment;

    public abstract void setCharacter();

    public Character() {
    }

    public Character(String name, int health, int energy, int defense, int damage, Equipment equipment,Skill skill) {
        this.name = name;
        this.health = health;
        this.energy = energy;
        this.defense = defense;
        this.damage = damage;
        this.equipment = equipment;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", energy=" + energy +
                ", defense=" + defense +
                ", damage=" + damage +
                ", skill=" + skill +
                ", equipment=" + equipment +
                '}';
    }
}
