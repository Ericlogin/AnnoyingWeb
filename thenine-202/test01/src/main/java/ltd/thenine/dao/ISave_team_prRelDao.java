package ltd.thenine.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ISave_team_prRelDao {
    void save_team_prRel(@Param("program_id") int program_id, @Param("team_id")int team_id);
}
