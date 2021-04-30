package ltd.thenine.service.impl;



import ltd.thenine.dao.IUserDao;
import ltd.thenine.entity.User;
import ltd.thenine.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService implements IUserService {

    @Autowired
    private IUserDao iUserDao;

    @Override
    public User login(String email, String password) {
        return iUserDao.login(email, password);
    }

    @Override
    public void sendmail(String email, String verifycode) {
        iUserDao.sendmail(email, verifycode);
    }

    @Override
    public User verify(String email, String verifycode) {
        return iUserDao.verify(email, verifycode);
    }

    @Override
    public void register(String email, String password) {
        iUserDao.register(email, password);
    }

    @Override
    public User exist(String email) {
        return iUserDao.exist(email);
    }

    @Override
    public void updateVerifycode(String email, String verifycode) {
        iUserDao.updateVerifycode(email, verifycode);
    }

    @Override
    public User getInfo(int user_id) {
        return iUserDao.getInfo(user_id);
    }

    @Override
    public void updateInfo(int user_id, String name, String major, String grade, String phone, String signature, String experience_description) {
        iUserDao.updateInfo(user_id, name, major, grade, phone, signature, experience_description);
    }

}
