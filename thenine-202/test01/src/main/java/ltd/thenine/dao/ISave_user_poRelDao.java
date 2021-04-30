package ltd.thenine.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ISave_user_poRelDao {
    void save_user_poRel(@Param("position_id") int position_id, @Param("user_id")int user_id);
}
