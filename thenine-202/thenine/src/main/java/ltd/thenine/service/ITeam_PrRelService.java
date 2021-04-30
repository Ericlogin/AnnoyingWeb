package ltd.thenine.service;

import ltd.thenine.entity.Team_PrRel;

import java.util.List;

public interface ITeam_PrRelService {

    List<Team_PrRel> searchTeam(int program_id);

}
