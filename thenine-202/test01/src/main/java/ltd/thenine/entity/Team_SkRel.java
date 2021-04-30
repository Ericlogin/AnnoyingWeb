package ltd.thenine.entity;

public class Team_SkRel {
    private String skill_ids;
    private int skill_id;
    private int team_id;
    private int number;

    public String getSkill_ids() {
        return skill_ids;
    }

    public void setSkill_ids(String skill_ids) {
        this.skill_ids = skill_ids;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSkill_id() {
        return skill_id;
    }

    public void setSkill_id(int skill_id) {
        this.skill_id = skill_id;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }
}
