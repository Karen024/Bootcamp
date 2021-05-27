package OptionalClasswork.rpgGame.skills;

import OptionalClasswork.rpgGame.equipment.Bow;
import OptionalClasswork.rpgGame.equipment.DualDaggers;

public class AssassinSkill extends Skill {
    private AssassinSkill(int skillDamage, String skillName, int skillCost, int skillCooldown) {
        super(skillDamage, skillName, skillCost, skillCooldown);
    }


    public static AssassinSkill createSkill(Bow bow) {
        return new AssassinSkill(0, "Triple Shot", 40, 3);
    }

    public static AssassinSkill createSkill(DualDaggers dualDaggers) {
        return new AssassinSkill(0, "Prepare Critical", 50, 3);
    }
}
