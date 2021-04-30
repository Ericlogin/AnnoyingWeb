package ltd.thenine.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ISave_team_poRelDao {
    void save_team_poRel(@Param("number") int number,@Param("position_id") int position_id,@Param("team_id")int team_id);
}
