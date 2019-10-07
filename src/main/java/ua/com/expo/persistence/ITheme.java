package ua.com.expo.persistence;

import ua.com.expo.persistence.domain.Theme;

import java.util.List;

public interface ITheme {

    List<Theme> findAll();

    Theme findThemeById(Long id);

    Theme save(Theme theme);

}
