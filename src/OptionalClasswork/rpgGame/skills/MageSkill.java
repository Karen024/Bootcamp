package OptionalClasswork.rpgGame.skills;

import OptionalClasswork.rpgGame.equipment.Staff;
import OptionalClasswork.rpgGame.equipment.WandAndBuckler;

public class MageSkill extends Skill {
    private MageSkill(int skillDamage, String skillName, int skillCost, int skillCooldown) {
        super(skillDamage, skillName, skillCost, skillCooldown);
    }


    public static MageSkill createSkill(Staff staff) {
        return new MageSkill(200, "Fireball", 50, 3);
    }

    public static MageSkill createSkill(WandAndBuckler wandAndBuckler) {
        return new MageSkill(200, "Magic Shield", 50, 3);
    }
}
