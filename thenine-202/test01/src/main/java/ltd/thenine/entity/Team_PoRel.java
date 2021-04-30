package ltd.thenine.entity;

public class Team_PoRel {
    private String position_ids;
    private int position_id;
    private int team_id;
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition_ids() {
        return position_ids;
    }

    public void setPosition_ids(String position_ids) {
        this.position_ids = position_ids;
    }

    public int getPosition_id() {
        return position_id;
    }

    public void setPosition_id(int position_id) {
        this.position_id = position_id;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }
}
