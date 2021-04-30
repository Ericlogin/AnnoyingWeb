package ltd.thenine.dao;


import ltd.thenine.entity.User_PoRel;
import ltd.thenine.entity.User_PrRel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUser_PrRelDao {

    List<User_PrRel> searchUser(@Param("program_id") int program_id);

    void updatePr(@Param("program_id") int program_id);

    User_PrRel searchOne(@Param("program_id") int program_id, @Param("user_id") int user_id);

}
