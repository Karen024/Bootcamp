package OptionalClasswork.rpgGame.skills;

import OptionalClasswork.rpgGame.equipment.GreatSword;
import OptionalClasswork.rpgGame.equipment.SwordAndShield;

public class WarriorSkill extends Skill {
    private WarriorSkill(int skillDamage, String skillName, int skillCost, int skillCooldown) {
        super(skillDamage, skillName, skillCost, skillCooldown);
    }


    public static WarriorSkill createSkill(GreatSword greatSword) {
        return new WarriorSkill(100, "Slice", 50, 2);
    }

    public static WarriorSkill createSkill(SwordAndShield swordAndShield) {
        return new WarriorSkill(30, "Stun", 50, 2);
    }


}
