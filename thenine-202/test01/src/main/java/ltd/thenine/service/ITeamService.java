package ltd.thenine.service;

import ltd.thenine.entity.Team;

import java.util.List;

public interface ITeamService {

    Team selectTeam(int team_id);

    List<Team> selectAll();

}
