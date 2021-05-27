package OptionalClasswork.rpgGame.equipment;

import OptionalClasswork.rpgGame.character.Warrior;

public class GreatSword extends WarriorEquipment {
    private int damageBoost;
    private int defensePenalty;

    public GreatSword() {
        this.damageBoost = 40;
        this.defensePenalty = 40;
    }

    @Override
    public void changeStats(Warrior warrior) {
        warrior.setDamage(warrior.getDamage() + damageBoost);
        warrior.setDefense(warrior.getDefense() - defensePenalty);
    }
}
