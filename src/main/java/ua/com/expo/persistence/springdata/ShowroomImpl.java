package ua.com.expo.persistence.springdata;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ua.com.expo.persistence.IShowroom;
import ua.com.expo.persistence.domain.Showroom;
import ua.com.expo.persistence.repository.ShowroomRepository;

import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class ShowroomImpl implements IShowroom {

    private final ShowroomRepository showroomRepository;


    @Override
    public List<Showroom> findAll() {
        return showroomRepository.findAll();
    }

    @Override
    public Optional<Showroom> findShowroomById(Long id) {
        return showroomRepository.findShowroomById(id);
    }

    @Override
    public Showroom save(Showroom showroom) {
        return showroomRepository.save(showroom);
    }
}
