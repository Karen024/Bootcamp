package OptionalClasswork.rpgGame.equipment;

import OptionalClasswork.rpgGame.character.Assassin;

public class Bow extends AssassinEquipment {
    private int damageBoost;
    private int energyBoost;
    private int defensePenalty;

    public Bow() {
        this.damageBoost = 40;
        this.energyBoost = 20;
        this.defensePenalty = 10;
    }

    @Override
    public void changeStats(Assassin assassin) {
        assassin.setDamage(assassin.getDamage() + damageBoost);
        assassin.setEnergy(assassin.getEnergy() + energyBoost);
        assassin.setDefense(assassin.getDefense() - defensePenalty);
    }

}
