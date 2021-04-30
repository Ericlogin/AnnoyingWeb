package ltd.thenine.service.impl;

import ltd.thenine.dao.ITeam_imageDao;
import ltd.thenine.entity.Team_image;
import ltd.thenine.service.ITeam_imageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Team_imageService implements ITeam_imageService {

    @Autowired
    ITeam_imageDao iTeam_imageDao;

    @Override
    public Team_image selectImg(int image_id) {
        return iTeam_imageDao.selectImg(image_id);
    }


}
