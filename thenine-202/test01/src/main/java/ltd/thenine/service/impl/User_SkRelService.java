package ltd.thenine.service.impl;

import ltd.thenine.dao.IUser_SkRelDao;
import ltd.thenine.entity.User_SkRel;
import ltd.thenine.service.IUser_SkRelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class User_SkRelService implements IUser_SkRelService {

    @Autowired
    private IUser_SkRelDao iUser_skRelDao;


    @Override
    public List<User_SkRel> searchUser(int skill_id) {
        return iUser_skRelDao.searchUser(skill_id);
    }

    @Override
    public void updateSk(int skill_id) {
        iUser_skRelDao.updateSk(skill_id);
    }

    @Override
    public User_SkRel searchOne(int skill_id, int user_id) {
        return searchOne(skill_id, user_id);
    }
}
