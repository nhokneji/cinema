package cinema.domain.repo;

import cinema.domain.entities.CinemaEntity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaRepo extends JpaRepository<CinemaEntity, Integer> {
	List<CinemaEntity> findByCinemaName(String name);
}
