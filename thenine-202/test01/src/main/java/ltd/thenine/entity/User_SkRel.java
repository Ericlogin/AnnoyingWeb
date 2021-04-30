package ltd.thenine.entity;

public class User_SkRel {
    private String skill_ids;
    private int skill_id;
    private int user_id;

    public String getSkill_ids() {
        return skill_ids;
    }

    public void setSkill_ids(String skill_ids) {
        this.skill_ids = skill_ids;
    }

    public int getSkill_id() {
        return skill_id;
    }

    public void setSkill_id(int skill_id) {
        this.skill_id = skill_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
