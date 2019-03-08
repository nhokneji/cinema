package cinema.domain.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cinema.domain.entities.CinemaEntity;
import cinema.domain.entities.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Integer>{
	@Query(value = "select u.user_name from user u where u.user_name= :userName AND u.user_pass =:userPass", nativeQuery = true)
	List<CinemaEntity> login(@Param("userName") String userName,
							 @Param("userPass") String userPass);
//	CinemaEntity f
	
	
	UserEntity findByUserName(String userName);
}
