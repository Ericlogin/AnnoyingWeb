package ltd.thenine.service;

import ltd.thenine.entity.User_PoRel;
import ltd.thenine.entity.User_PrRel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUser_PrRelService {

    List<User_PrRel> searchUser(int program_id);

    void updatePr(int program_id);

    User_PrRel searchOne(@Param("program_id") int program_id, @Param("user_id") int user_id);

}
