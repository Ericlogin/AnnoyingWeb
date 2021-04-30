package ltd.thenine.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ISave_user_roRelDao {
    void save_user_roRel(@Param("role_id") int role_id, @Param("user_id")int user_id);
}
