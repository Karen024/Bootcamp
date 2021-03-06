package OptionalClasswork.rpgGame.equipment;

import OptionalClasswork.rpgGame.character.Assassin;

public class DualDaggers extends AssassinEquipment {
    private int defenceBoost;
    private int energyBoost;

    public DualDaggers() {
        this.defenceBoost = 20;
        this.energyBoost = 20;
    }

    @Override
    public void changeStats(Assassin assassin) {
        assassin.setEnergy(assassin.getEnergy() + energyBoost);
        assassin.setDefense(assassin.getDefense() + defenceBoost);
    }
}
