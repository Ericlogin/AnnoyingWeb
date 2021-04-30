package ltd.thenine.service.impl;

import ltd.thenine.dao.ITeam_SkRelDao;
import ltd.thenine.entity.Team_SkRel;
import ltd.thenine.service.ITeam_SkRelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Team_SkRelService implements ITeam_SkRelService {

    @Autowired
    private ITeam_SkRelDao iTeam_skRelDao;


    @Override
    public List<Team_SkRel> searchTeam(int skill_id) {
        return iTeam_skRelDao.searchTeam(skill_id);
    }

    @Override
    public List<Team_SkRel> searchSkill(int team_id) {
        return iTeam_skRelDao.searchSkill(team_id);
    }
}
