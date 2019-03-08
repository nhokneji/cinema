package cinema.domain.repo;

import cinema.domain.entities.ShowtimeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowTimeRepo extends JpaRepository<ShowtimeEntity, Integer> {
    List<ShowtimeEntity> findByCinemaIdAndAndShowtimePartTime(int id, int partDate);

    List<ShowtimeEntity> findByMovieMovieIdAndShowtimePartTime(int movieId, int partDate);


}
