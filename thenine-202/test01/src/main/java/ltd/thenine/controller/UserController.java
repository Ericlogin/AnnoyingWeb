package ltd.thenine.controller;

import com.alibaba.fastjson.JSONObject;
import ltd.thenine.entity.User;
import ltd.thenine.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

/**
 * @Author Jiyao Zhang
 */

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private JavaMailSender mailSender;
    @Autowired
    private IUserService iUserService;

    /**
     * 验证登录
     * @param user
     * @return
     */
    @PostMapping("login")
    public String login(@RequestBody User user) {
        User res = iUserService.login(user.getEmail(), user.getPassword());
        JSONObject ret = new JSONObject();
        if (res == null) {
            ret.put("user_id", 0);
            ret.put("email", "");
            ret.put("isSuccess", false);
        } else {
            boolean hasTeam = true;
            if (res.getTeam_id() == 0) {
                hasTeam = false;
            }
            ret.put("user_id", res.getUser_id());
            ret.put("hasTeam", hasTeam);
            ret.put("email", res.getEmail());
            ret.put("isSuccess", true);
        }
        return ret.toJSONString();
        // return login.getUsername().equals(login1.getUsername()) && login.getPassword().equals(login1.getPassword());
    }


    /**
     * 发送验证码, 并将验证码储存到数据库里
     * @param user
     */
    @PostMapping("send")
    public String sendmail(@RequestBody User user){
        // 生成6位随机验证码
        Random random = new Random();
        StringBuilder verifycode = new StringBuilder(String.valueOf(random.nextInt(999999)));
        if (verifycode.length() < 6) {
            for (int i = 0; i < 6 - verifycode.length(); i++) {
                verifycode.append('0');
            }
        }
        user.setVerifycode(verifycode.toString());

        Boolean isExist = exist(user);

        SimpleMailMessage message = new SimpleMailMessage();
        // 发件人
        message.setFrom("2565246797@qq.com");
        // 收件人
        message.setTo(user.getEmail());
        // 邮件标题
        message.setSubject("THE9：Check the verify code");
        // 邮件内容
        message.setText("Hi, this is your verify code: "+ user.getVerifycode());
        // 抄送人
        //message.setCc("xxx@qq.com");
        JSONObject ret = new JSONObject();

        try {
            mailSender.send(message);
            if (isExist) {
                iUserService.updateVerifycode(user.getEmail(), user.getVerifycode());
            } else {
                iUserService.sendmail(user.getEmail(), user.getVerifycode());
            }
            ret.put("isSuccess", true);
        } catch (MailException e) {
            ret.put("isSuccess", false);
        }
        return ret.toJSONString();
    }

    /**
     * 验证邮箱和对应的验证码是否匹配
     * @param user
     */
    @PostMapping("verify")
    public String verify(@RequestBody User user) {
        User result = iUserService.verify(user.getEmail(), user.getVerifycode());
        JSONObject ret = new JSONObject();
        if (result == null) {
            ret.put("isSuccess", false);
        } else {
            ret.put("isSuccess", true);
        }
        return ret.toJSONString();
    }

    /**
     * 将密码存入数据库
     * @param user
     */
    @PostMapping("register")
    public String register(@RequestBody User user){
        JSONObject ret = new JSONObject();
        try {
            iUserService.register(user.getEmail(), user.getPassword());
            ret.put("isSuccess", true);
        } catch (Exception e) {
            ret.put("isSuccess", false);
        }
        return ret.toJSONString();
    }


    /**
     * 判断数据库里是否已经存在给定邮箱
     * @param user
     */
    @PostMapping("exist")
    public Boolean exist(@RequestBody User user){
        User result = iUserService.exist(user.getEmail());
        return result != null;
    }

    /**
     * 返回个人信息
     */
    @PostMapping("getinfo")
    public String showInfo(@RequestBody User user) {
        User res = iUserService.getInfo(user.getUser_id());
        JSONObject ret = new JSONObject();
        if (res == null) {
            ret.put("isSuccess", false);
        } else {
            ret.put("user_id", res.getUser_id());
            ret.put("email", res.getEmail());
            ret.put("team_id", res.getTeam_id());
            ret.put("name", res.getName());
            ret.put("major", res.getMajor());
            ret.put("grade", res.getGrade());
            ret.put("phone", res.getPhone());
            ret.put("photo_id", res.getPhoto_id());
            ret.put("signature", res.getSignature());
            ret.put("experience_description", res.getExperience_description());
            ret.put("isSuccess", true);
        }
        return ret.toJSONString();
    }


    /**
     * 更新个人信息
     */
    @PostMapping("update")
    public String updateInfo(@RequestBody User user){
        JSONObject ret = new JSONObject();
        try {
            iUserService.updateInfo(user.getUser_id(), user.getName(), user.getMajor(), user.getGrade(), user.getPhone(), user.getSignature(), user.getExperience_description());
            ret.put("isSuccess", true);
        } catch (Exception e) {
            ret.put("isSuccess", false);
        }
        return ret.toJSONString();
    }




}
