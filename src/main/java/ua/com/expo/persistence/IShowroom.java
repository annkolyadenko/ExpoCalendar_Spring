package ua.com.expo.persistence;

import ua.com.expo.persistence.domain.Showroom;

import java.util.List;
import java.util.Optional;

public interface IShowroom {

    List<Showroom> findAll();

    Optional<Showroom> findShowroomById(Long id);

    Showroom save(Showroom showroom);

}
