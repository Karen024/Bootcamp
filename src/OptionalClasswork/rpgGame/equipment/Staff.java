package OptionalClasswork.rpgGame.equipment;

import OptionalClasswork.rpgGame.character.Mage;

public class Staff extends MageEquipment {
    private int energyBoost;
    private int damageBoost;

    public Staff() {
        this.energyBoost = 20;
        this.damageBoost = 40;
    }

    @Override
    public void changeStats(Mage mage) {
        mage.setDamage(mage.getDamage() + damageBoost);
        mage.setEnergy(mage.getEnergy() + energyBoost);
    }
}
