package ua.com.expo.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.expo.persistence.domain.Theme;

public interface ThemeRepository extends JpaRepository<Theme, Long> {

    Theme findThemeById(Long id);
}
