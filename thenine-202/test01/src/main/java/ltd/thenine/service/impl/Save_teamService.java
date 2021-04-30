package ltd.thenine.service.impl;

import ltd.thenine.dao.*;
import ltd.thenine.entity.*;
import ltd.thenine.service.ISave_teamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Save_teamService implements ISave_teamService {
    @Autowired
    private ISave_teamDao iSave_team_Dao;
    private ISave_team_poRelDao iSave_team_poRelDao;
    private ISave_team_prRelDao iSave_team_prRelDao;
    private ISave_team_skRelDao iSave_team_skRelDao;
    private ISave_userDao iSave_userDao;

    public Save_teamService(ISave_team_poRelDao iSave_team_poRelDao, ISave_team_prRelDao iSave_team_prRelDao, ISave_team_skRelDao iSave_team_skRelDao, ISave_userDao iSave_userDao) {
        this.iSave_team_poRelDao = iSave_team_poRelDao;
        this.iSave_team_prRelDao = iSave_team_prRelDao;
        this.iSave_team_skRelDao = iSave_team_skRelDao;
        this.iSave_userDao = iSave_userDao;
    }

    @Override
    public int save_team(Team team) {
        if (iSave_team_Dao.check_team_deplication(team.getName()) != null) {
            System.out.println("team name exist");
            return -1;
        }
        if (iSave_userDao.check_have_team(team.getLeader_name()) != null) {
            System.out.println("on a team");
            return 0;
        }
        iSave_team_Dao.save_team(team.getName(), team.getLeader_name(), team.getScope(), team.getImage_id());
        return team.getNumber();
    }

    @Override
    public void save_team_prRel(Team team, Team_PrRel team_prRel) {
        iSave_team_prRelDao.save_team_prRel(team_prRel.getProgram_id(), iSave_team_Dao.get_team_id(team.getName()).getTeam_id());

    }

    @Override
    public void save_team_poRel(Team team, Team_PoRel team_poRel) {
        String[] str1 = team_poRel.getPosition_ids().split(",");
        for (int i = 0; i < str1.length; i++) {
            iSave_team_poRelDao.save_team_poRel(team_poRel.getNumber(), Integer.parseInt(str1[i]), iSave_team_Dao.get_team_id(team.getName()).getTeam_id());
        }

    }

    @Override
    public void save_team_skRel(Team team, Team_SkRel team_skRel) {
        String[] str1 = team_skRel.getSkill_ids().split(",");
        for (int i = 0; i < str1.length; i++) {
            iSave_team_skRelDao.save_team_skRel(team_skRel.getNumber(), Integer.parseInt(str1[i]), iSave_team_Dao.get_team_id(team.getName()).getTeam_id());
        }
    }
}

