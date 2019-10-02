package ua.com.expo.persistence.springdata;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ua.com.expo.persistence.ITheme;
import ua.com.expo.persistence.entity.Theme;
import ua.com.expo.persistence.repository.ThemeRepository;

import java.util.List;

@Repository
@AllArgsConstructor
public class ThemeImpl implements ITheme {

    private ThemeRepository themeRepository;

    @Override
    public List<Theme> findAll() {
        return themeRepository.findAll();
    }

    @Override
    public Theme findThemeById(Long id) {
        return themeRepository.findThemeById(id);
    }

    @Override
    public Theme save(Theme theme) {
        return themeRepository.save(theme);
    }
}
