package ltd.thenine.service.impl;

import ltd.thenine.dao.IUser_imageDao;
import ltd.thenine.entity.User_image;
import ltd.thenine.service.IUser_imageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class User_imageService implements IUser_imageService {

    @Autowired
    IUser_imageDao iUser_imageDao;

    @Override
    public User_image selectImg(int image_id) {
        return iUser_imageDao.selectImg(image_id);
    }


}
