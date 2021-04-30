package ltd.thenine.dao;


import ltd.thenine.entity.Team_PrRel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITeam_PrRelDao {

    List<Team_PrRel> searchTeam(@Param("program_id") int program_id);

}
