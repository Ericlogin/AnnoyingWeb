package ltd.thenine.service;

import ltd.thenine.entity.User_PoRel;
import ltd.thenine.entity.User_SkRel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUser_SkRelService {

    // 根据skill_id搜索team_id
    List<User_SkRel> searchUser(int skill_id);

    void updateSk(int skill_id);

    User_SkRel searchOne(@Param("skill_id") int skill_id, @Param("user_id") int user_id);

}
