package ltd.thenine.service.impl;

import ltd.thenine.dao.IUser_PrRelDao;
import ltd.thenine.entity.User_PrRel;
import ltd.thenine.service.IUser_PrRelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class User_PrRelService implements IUser_PrRelService {


    @Autowired
    private IUser_PrRelDao iUser_prRelDao;

    @Override
    public List<User_PrRel> searchUser(int program_id) {
        return iUser_prRelDao.searchUser(program_id);
    }

    @Override
    public void updatePr(int program_id) {
        iUser_prRelDao.updatePr(program_id);
    }

    @Override
    public User_PrRel searchOne(int program_id, int user_id) {
        return iUser_prRelDao.searchOne(program_id, user_id);
    }
}
