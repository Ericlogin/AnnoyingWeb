package ltd.thenine.service.impl;

import ltd.thenine.dao.ITeam_PrRelDao;
import ltd.thenine.entity.Team_PrRel;
import ltd.thenine.service.ITeam_PrRelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Team_PrRelService implements ITeam_PrRelService {


    @Autowired
    private ITeam_PrRelDao iTeam_prRelDao;

    @Override
    public List<Team_PrRel> searchTeam(int program_id) {
        return iTeam_prRelDao.searchTeam(program_id);
    }
}
