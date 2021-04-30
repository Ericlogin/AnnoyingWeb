package ltd.thenine.service;


import ltd.thenine.entity.User;

public interface IUserService {

    User login(String email, String password);
    void sendmail(String email, String verifycode);
    // 验证验证码
    User verify(String email, String verifycode);
    // 将注册信息提交到数据库
    void register(String email, String password);
    // 检查邮箱是否已经存
    User exist(String email);
    void updateVerifycode(String email, String verifycode);
    User getInfo(int user_id);
    void updateInfo(int user_id, String name, String major, String grade, String phone, String signature, String experience_description);
}
