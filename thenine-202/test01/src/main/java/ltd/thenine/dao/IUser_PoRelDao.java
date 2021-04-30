package ltd.thenine.dao;


import ltd.thenine.entity.User_PoRel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUser_PoRelDao {

    List<User_PoRel> searchUser(@Param("position_id") int position_id);

    void updatePo(@Param("position_id") int position_id);

    User_PoRel searchOne(@Param("position_id") int position_id, @Param("user_id") int user_id);

}
