package OptionalClasswork.RpgGame.Skills;

import OptionalClasswork.RpgGame.Equipment.Staff;
import OptionalClasswork.RpgGame.Equipment.WandAndBuckler;

public class MageSkill extends Skill {
    private MageSkill(int skillDamage, String skillName, int skillCost, int skillCooldown) {
        super(skillDamage, skillName, skillCost, skillCooldown);
    }

    public MageSkill() {
        super();
    }

    public static MageSkill createSkill(Staff staff) {
        return new MageSkill(200, "Fireball", 50, 3);
    }

    public static MageSkill createSkill(WandAndBuckler wandAndBuckler) {
        return new MageSkill(200, "Magic Heal", 50, 3);
    }
}
