package ltd.thenine.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ISave_user_riRelDao {
    void save_user_riRel(@Param("right_id") int right_id, @Param("user_id")int user_id);
}
