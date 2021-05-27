package OptionalClasswork.rpgGame.skills;

public abstract class Skill {
    private int skillDamage;
    private String skillName;
    private int skillCost;
    private int skillCooldown;

    public Skill() {
    }

    public Skill(int skillDamage, String skillName, int skillCost, int skillCooldown) {
        this.skillDamage = skillDamage;
        this.skillName = skillName;
        this.skillCost = skillCost;
        this.skillCooldown = skillCooldown;

    }

    public int getSkillDamage() {
        return skillDamage;
    }

    public void setSkillDamage(int skillDamage) {
        this.skillDamage = skillDamage;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public int getSkillCost() {
        return skillCost;
    }

    public void setSkillCost(int skillCost) {
        this.skillCost = skillCost;
    }

    public int getSkillCooldown() {
        return skillCooldown;
    }

    public void setSkillCooldown(int skillCooldown) {
        this.skillCooldown = skillCooldown;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "skillDamage=" + skillDamage +
                ", skillName='" + skillName + '\'' +
                ", skillCost=" + skillCost +
                ", skillCooldown=" + skillCooldown +
                '}';
    }
}
