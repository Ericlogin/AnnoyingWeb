package ltd.thenine.dao;

import ltd.thenine.entity.Team;
import ltd.thenine.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ISave_teamDao {
    int save_team(@Param("name") String name, @Param("leader_name") String leader_name, @Param("scope") String scope,  @Param("image_id") int image_id);

    Team check_team_deplication(@Param("name") String name);

    Team get_team_id(@Param("name") String name);

}
