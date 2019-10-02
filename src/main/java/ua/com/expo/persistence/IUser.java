package ua.com.expo.persistence;

import ua.com.expo.persistence.entity.User;

import java.util.Optional;

public interface IUser {

    Optional<User> findUserByEmail(String email);

    User save(User user);

    boolean saveLanguageByUserId(Long id, String language);

    Optional<User> findUserById(Long id);



}
