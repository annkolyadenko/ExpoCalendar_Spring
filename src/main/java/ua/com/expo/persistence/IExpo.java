package ua.com.expo.persistence;

import ua.com.expo.persistence.domain.Expo;

import java.sql.Timestamp;
import java.util.List;

public interface IExpo {

    List<Expo> findAllExpoByThemeIdAndDate(Long id, Timestamp date);

    List<Expo> findAllExpoByShowroomId(Long id);

    List<Expo> findAllExpoByShowroomIdAndDate(Long id, Timestamp date);

    Expo save(Expo expo);

}
