package ltd.thenine.dao;

import ltd.thenine.entity.Team_SkRel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITeam_SkRelDao {

    List<Team_SkRel> searchTeam(@Param("skill_id") int skill_id);

    List<Team_SkRel> searchSkill(@Param("team_id") int team_id);



}
