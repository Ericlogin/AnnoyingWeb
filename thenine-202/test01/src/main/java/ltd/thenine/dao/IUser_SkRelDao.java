package ltd.thenine.dao;

import ltd.thenine.entity.User_PoRel;
import ltd.thenine.entity.User_SkRel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUser_SkRelDao {

    List<User_SkRel> searchUser(@Param("skill_id") int skill_id);

    void updateSk(@Param("skill_id") int skill_id);

    User_SkRel searchOne(@Param("skill_id") int skill_id, @Param("user_id") int user_id);

}
