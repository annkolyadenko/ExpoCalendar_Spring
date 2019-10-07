package ua.com.expo.persistence;

import ua.com.expo.persistence.domain.User;

import java.util.Optional;

public interface IUser {

    Optional<User> findUserByEmail(String email);

    User save(User user);

    /*User saveLanguageByUserId(Long id, String language);*/

    Optional<User> findUserById(Long id);



}
