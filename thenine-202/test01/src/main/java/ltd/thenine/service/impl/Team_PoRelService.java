package ltd.thenine.service.impl;

import ltd.thenine.dao.ITeam_PoRelDao;
import ltd.thenine.entity.Team_PoRel;
import ltd.thenine.service.ITeam_PoRelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Team_PoRelService implements ITeam_PoRelService {

    @Autowired
    private ITeam_PoRelDao iTeam_poRelDao;


    @Override
    public List<Team_PoRel> searchTeam(int position_id) {
        return iTeam_poRelDao.searchTeam(position_id);
    }
}
