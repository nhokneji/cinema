package cinema.domain.repo;

import cinema.domain.entities.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepo extends JpaRepository<TicketEntity, Integer> {
    List<TicketEntity> findByShowtimeId(int id);
}
