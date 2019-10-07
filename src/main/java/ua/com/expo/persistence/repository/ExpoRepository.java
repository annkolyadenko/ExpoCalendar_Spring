package ua.com.expo.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.expo.persistence.domain.Expo;

import java.sql.Timestamp;
import java.util.List;

public interface ExpoRepository extends JpaRepository<Expo, Long> {

    List<Expo> findAllExpoByThemeIdAndDate(Long id, Timestamp date);

    //TODO PAGINATION
    List<Expo> findAllExpoByShowroomId(Long id);

    List<Expo> findAllExpoByShowroomIdAndDate(Long id, Timestamp date);






}
