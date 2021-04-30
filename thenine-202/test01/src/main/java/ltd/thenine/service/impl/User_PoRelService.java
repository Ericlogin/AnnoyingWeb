package ltd.thenine.service.impl;

import ltd.thenine.dao.IUser_PoRelDao;
import ltd.thenine.entity.User_PoRel;
import ltd.thenine.service.IUser_PoRelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class User_PoRelService implements IUser_PoRelService {

    @Autowired
    private IUser_PoRelDao iUser_poRelDao;


    @Override
    public List<User_PoRel> searchUser(int position_id) {
        return iUser_poRelDao.searchUser(position_id);
    }

    @Override
    public void updatePo(int position_id) {
        iUser_poRelDao.updatePo(position_id);
    }

    @Override
    public User_PoRel searchOne(int position_id, int user_id) {
        return iUser_poRelDao.searchOne(position_id, user_id);
    }
}
