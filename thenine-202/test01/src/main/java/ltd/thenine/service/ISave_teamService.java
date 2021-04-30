package ltd.thenine.service;

import ltd.thenine.entity.*;

public interface ISave_teamService {
    int save_team(Team team);
    void save_team_poRel(Team team,Team_PoRel team_poRel);
    void save_team_skRel(Team team,Team_SkRel team_skRel);
    void save_team_prRel(Team team, Team_PrRel team_prRel);
}
