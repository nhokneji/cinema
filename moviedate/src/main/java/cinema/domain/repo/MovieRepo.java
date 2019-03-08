package cinema.domain.repo;

import cinema.domain.entities.CinemaEntity;
import cinema.domain.entities.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface MovieRepo extends JpaRepository<MovieEntity, Integer> {
    CinemaEntity findByMovieName(String name);
}
