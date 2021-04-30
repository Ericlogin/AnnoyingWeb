package ltd.thenine.dao;


import ltd.thenine.entity.Team_image;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeam_imageDao {

    Team_image selectImg(@Param("image_id") int image_id);

}
