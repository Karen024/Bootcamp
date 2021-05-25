package OptionalClasswork.RpgGame.Equipment;

import OptionalClasswork.RpgGame.Character.Mage;

public class WandAndBuckler extends MageEquipment {
    private int energyPenalty;
    private int defenseBoost;
    private int damageBoost;

    public WandAndBuckler() {
        this.energyPenalty = 20;
        this.defenseBoost = 20;
        this.damageBoost = 20;
    }

    @Override
    public void changeStats(Mage mage) {
        mage.setDamage(mage.getDamage() + damageBoost);
        mage.setDefense(mage.getDefense() + defenseBoost);
        mage.setEnergy(mage.getEnergy() - energyPenalty);
    }
}
