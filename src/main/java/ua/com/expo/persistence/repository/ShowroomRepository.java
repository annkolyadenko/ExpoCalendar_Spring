package ua.com.expo.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.expo.persistence.domain.Showroom;

import java.util.Optional;

public interface ShowroomRepository extends JpaRepository<Showroom, Long> {

    Optional<Showroom> findShowroomById(Long id);
}
