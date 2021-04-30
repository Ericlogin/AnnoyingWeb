package ltd.thenine.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ISave_team_skRelDao {
    void save_team_skRel(@Param("number") int number,@Param("skill_id") int skill_id, @Param("team_id")int team_id);
}
