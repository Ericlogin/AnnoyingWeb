package ltd.thenine.service;

import ltd.thenine.entity.User_PoRel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUser_PoRelService {

    List<User_PoRel> searchUser(int position_id);

    void updatePo(int position_id);

    User_PoRel searchOne(int position_id, int user_id);

}
