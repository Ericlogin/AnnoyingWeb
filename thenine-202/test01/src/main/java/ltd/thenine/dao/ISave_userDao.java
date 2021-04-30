package ltd.thenine.dao;

import ltd.thenine.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ISave_userDao {
    int save_user_info(@Param("user_id") int user_id,@Param("name") String name, @Param("major") String major, @Param("phone") String phone, @Param("photo_id") int photo_id,@Param("experience_description") String experience_description);

    User check_have_team(@Param("leader_name") String leader_name);
}
