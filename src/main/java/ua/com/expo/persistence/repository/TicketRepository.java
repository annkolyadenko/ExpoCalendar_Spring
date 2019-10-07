package ua.com.expo.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.expo.persistence.domain.Ticket;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

    List<Ticket> findAllByUserId(Long id);
}
