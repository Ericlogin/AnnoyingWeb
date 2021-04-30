package ltd.thenine.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ISave_user_skRelDao {
    void save_user_skRel(@Param("skill_id") int skill_id, @Param("user_id")int user_id);
}
