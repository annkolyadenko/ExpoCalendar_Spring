package ua.com.expo.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.expo.persistence.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUserByEmail(String email);

    /*User saveLanguageByUserId(Long id, String language);*/






}
