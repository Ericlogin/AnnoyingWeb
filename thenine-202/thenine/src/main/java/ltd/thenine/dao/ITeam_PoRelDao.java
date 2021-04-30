package ltd.thenine.dao;


import ltd.thenine.entity.Team_PoRel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITeam_PoRelDao {

    List<Team_PoRel> searchTeam(@Param("position_id") int position_id);

}
