package ua.com.expo.persistence.springdata;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ua.com.expo.persistence.IUser;
import ua.com.expo.persistence.domain.User;
import ua.com.expo.persistence.repository.UserRepository;

import java.util.Optional;

@Repository
@AllArgsConstructor
public class UserImpl implements IUser {

    private final UserRepository userRepository;


    @Override
    public Optional<User> findUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    /*@Override
    public User saveLanguageByUserId(Long id, String language) {
        return userRepository.saveLanguageByUserId(id, language);
    }*/

    @Override
    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }
}
