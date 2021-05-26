package OptionalClasswork.RpgGame.Skills;

import OptionalClasswork.RpgGame.Equipment.Bow;
import OptionalClasswork.RpgGame.Equipment.DualDaggers;

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
