package ltd.thenine.service.impl;

import ltd.thenine.dao.ITeamDao;
import ltd.thenine.entity.Team;
import ltd.thenine.service.ITeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TeamService implements ITeamService {

    @Autowired
    private ITeamDao iTeamDao;

    @Override
    public Team selectTeam(int team_id) {
        return iTeamDao.selectTeam(team_id);
    }

    @Override
    public List<Team> selectAll() {
        return iTeamDao.selectAll();
    }
}
