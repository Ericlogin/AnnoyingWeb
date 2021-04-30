package ltd.thenine.dao;

import ltd.thenine.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface IUserDao {

    // 查询登录
    User login(@Param("email") String email, @Param("password") String password);
    // 发送邮箱验证码
    void sendmail(@Param("email") String email, @Param("verifycode") String verifycode);
    // 验证验证码
    User verify(@Param("email") String email, @Param("verifycode") String verifycode);
    // 将注册信息提交到数据库
    void register(@Param("email") String email, @Param("password") String password);
    //更新验证码
    void updateVerifycode(@Param("email") String email, @Param("verifycode") String verifycode);
    // 判断邮箱是否已经存在于数据库里
    User exist(@Param("email") String email);
    // 返回全部个人信息
    User getInfo(@Param("user_id") int user_id);
    // 更新个人信息
    void updateInfo(@Param("user_id") int user_id, @Param("name") String name, @Param("major") String major, @Param("grade") String grade, @Param("phone") String phone, @Param("signature") String signature, @Param("experience_description") String experience_description);

}
