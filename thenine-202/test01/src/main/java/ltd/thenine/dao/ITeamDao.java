package ltd.thenine.dao;


import ltd.thenine.entity.Team;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITeamDao {

    Team selectTeam(@Param("team_id") int team_id);

    List<Team> selectAll();

}
