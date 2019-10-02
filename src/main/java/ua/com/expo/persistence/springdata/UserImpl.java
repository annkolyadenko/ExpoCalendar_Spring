package ua.com.expo.persistence.springdata;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ua.com.expo.persistence.IUser;
import ua.com.expo.persistence.entity.User;
import ua.com.expo.persistence.repository.UserRepository;

import java.util.Optional;

@Repository
@AllArgsConstructor
public class UserImpl implements IUser {

    private UserRepository userRepository;


    @Override
    public Optional<User> findUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public boolean saveLanguageByUserId(Long id, String language) {
        return userRepository.saveLanguageByUserId(id, language);
    }

    @Override
    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }
}
