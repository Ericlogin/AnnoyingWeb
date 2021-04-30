package ltd.thenine.controller;

import com.alibaba.fastjson.JSONObject;
import ltd.thenine.entity.User;
import ltd.thenine.entity.User_info;
import ltd.thenine.service.ISave_userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/save_user_info")
public class Save_userController {
@Autowired
public ISave_userService iSave_user_Service;
@RequestMapping(value = "/save_user_info",method = RequestMethod.POST)
    public String save_user_info(@RequestBody JSONObject jsonObject) {
        User user = new User();
        user.setUser_id((Integer) jsonObject.get("user_id"));
        user.setName((String) jsonObject.get("name"));
        user.setMajor((String) jsonObject.get("major"));
        user.setExperience_description((String) jsonObject.get("experience_description"));
        user.setPhone((String) jsonObject.get("phone"));
        user.setPhoto_id((Integer) jsonObject.get("photo_id"));



//    iSave_user_Service.save_user_info(user_info.user,user_info.user_poRel,user_info.user_prRel,user_info.user_riRel,user_info.user_roRel,user_info.user_skRel);
    iSave_user_Service.save_user_info1(user);
    return "upload succeeded";
}
}
