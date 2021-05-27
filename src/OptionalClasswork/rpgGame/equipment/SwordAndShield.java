package OptionalClasswork.rpgGame.equipment;

import OptionalClasswork.rpgGame.character.Warrior;

public class SwordAndShield extends WarriorEquipment {
    private int energyBoost;
    private int defenseBoost;
    private int damagePenalty;

    public SwordAndShield() {
        this.energyBoost = 20;
        this.defenseBoost = 20;
        this.damagePenalty = 20;
    }

    @Override
    public void changeStats(Warrior warrior) {
        warrior.setDamage(warrior.getDamage() - damagePenalty);
        warrior.setDefense(warrior.getDefense() + defenseBoost);
        warrior.setEnergy(warrior.getEnergy() + energyBoost);
    }
}
