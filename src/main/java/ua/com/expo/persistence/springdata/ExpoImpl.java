package ua.com.expo.persistence.springdata;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ua.com.expo.persistence.IExpo;
import ua.com.expo.persistence.entity.Expo;
import ua.com.expo.persistence.repository.ExpoRepository;

import java.sql.Timestamp;
import java.util.List;

@Repository
@AllArgsConstructor
public class ExpoImpl implements IExpo {

    private ExpoRepository expoRepository;

    @Override
    public List<Expo> findAllExpoByThemeIdAndDate(Long id, Timestamp date) {
        return expoRepository.findAllExpoByThemeIdAndDate(id, date);
    }

    @Override
    public List<Expo> findAllExpoByShowroomId(Long id) {
        return expoRepository.findAllExpoByShowroomId(id);
    }

    @Override
    public List<Expo> findAllExpoByShowroomIdAndDate(Long id, Timestamp date) {
        return expoRepository.findAllExpoByThemeIdAndDate(id, date);
    }

    @Override
    public Expo save(Expo expo) {
        return expoRepository.save(expo);
    }


}
