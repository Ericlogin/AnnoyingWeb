package ltd.thenine.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ISave_user_prRelDao {
    void save_user_prRel(@Param("program_id") int program_id, @Param("user_id")int user_id);
}
