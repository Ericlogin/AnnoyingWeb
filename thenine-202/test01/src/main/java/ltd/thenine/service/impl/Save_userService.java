package ltd.thenine.service.impl;

import ltd.thenine.dao.ISave_userDao;
import ltd.thenine.dao.ISave_user_poRelDao;
import ltd.thenine.dao.ISave_user_prRelDao;
import ltd.thenine.dao.ISave_user_skRelDao;
import ltd.thenine.entity.*;
import ltd.thenine.service.ISave_userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Save_userService implements ISave_userService {
    @Autowired
    private ISave_userDao iSave_user_Dao;
    private ISave_user_poRelDao iSave_user_poRelDao;
    private ISave_user_prRelDao iSave_user_prRelDao;
    private ISave_user_skRelDao iSave_user_skRelDao;

    public Save_userService(ISave_user_poRelDao iSave_user_poRelDao, ISave_user_prRelDao iSave_user_prRelDao, ISave_user_skRelDao iSave_user_skRelDao) {
        this.iSave_user_poRelDao = iSave_user_poRelDao;
        this.iSave_user_prRelDao = iSave_user_prRelDao;
        this.iSave_user_skRelDao = iSave_user_skRelDao;
    }

    @Override
    public String save_user_info1(User user) {
       iSave_user_Dao.save_user_info(user.getUser_id(),user.getName(),user.getMajor(),user.getPhone(),user.getPhoto_id(),user.getExperience_description());
//        String[] str1=user_poRel.getPosition_ids().split(",");
//        for(int i=0;i<str1.length;i++){
//            iSave_user_poRelDao.save_user_poRel(Integer.parseInt(str1[i]),user.getUser_id());
//        }
//        String[] str2=user_prRel.getProgram_ids().split(",");
//        for(int i=0;i<str2.length;i++){
//            iSave_user_prRelDao.save_user_prRel(Integer.parseInt(str2[i]),user.getUser_id());
//        }
//        String[] str3=user_skRel.getSkill_ids().split(",");
//        for(int i=0;i<str3.length;i++){
//            iSave_user_skRelDao.save_user_skRel(Integer.parseInt(str3[i]),user.getUser_id());
//        }
//        iSave_user_poRelDao.save_user_poRel(user_poRel.getPosition_id(),user.getUser_id());
//        iSave_user_prRelDao.save_user_prRel(user_prRel.getProgram_id(),user.getUser_id());
//        iSave_user_skRelDao.save_user_skRel(user_skRel.getSkill_id(),user.getUser_id());
        return "upload succeeded";
    }
}
