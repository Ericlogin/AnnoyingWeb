package ltd.thenine.service;

import ltd.thenine.entity.Team_SkRel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ITeam_SkRelService {

    // 根据skill_id搜索team_id
    List<Team_SkRel> searchTeam(int skill_id);

    List<Team_SkRel> searchSkill(int team_id);

}
