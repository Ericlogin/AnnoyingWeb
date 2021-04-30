package ltd.thenine.dao;


import ltd.thenine.entity.User_image;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IUser_imageDao {

    User_image selectImg(@Param("image_id") int image_id);

}
