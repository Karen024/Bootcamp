package OptionalClasswork.rpgGame.character;


import OptionalClasswork.rpgGame.equipment.Equipment;
import OptionalClasswork.rpgGame.skills.Skill;

public abstract class Character {
    private String name;
    private int health;
    private int energy;
    private int defense;
    private int damage;
    private boolean stunState;
    private Skill skill;
    private Equipment equipment;

    public abstract void receiveDamage(int damage);

    public abstract int useSkill(Character character,int coolDown);

    public abstract void attack(Character character);

    public abstract void setCharacter();

    public Character() {
    }

    public Character(String name, int health, int energy, int defense, int damage, boolean stunState, Equipment equipment, Skill skill) {
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

    public boolean isStunState() {
        return stunState;
    }

    public void setStunState(boolean stunState) {
        this.stunState = stunState;
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
