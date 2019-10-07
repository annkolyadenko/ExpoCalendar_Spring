package ua.com.expo.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ua.com.expo.dto.UserDto;
import ua.com.expo.exception.RuntimeServiceException;
import ua.com.expo.persistence.domain.User;
import ua.com.expo.persistence.domain.enums.LangType;
import ua.com.expo.persistence.domain.enums.RoleType;
import ua.com.expo.persistence.repository.UserRepository;
import ua.com.expo.util.security.IPasswordHashing;
import ua.com.expo.util.validator.IPasswordValidator;

import java.util.Objects;
import java.util.Optional;

@Slf4j
@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final IPasswordHashing passwordHashing;
    private final IPasswordValidator passwordValidator;

    public UserDto signInUser(UserDto userDto) {
        User user = userRepository.findUserByEmail(userDto.getEmail()).orElseThrow(() -> new RuntimeServiceException("User with this email doesn't exist. Please, enter email again"));
        if (Objects.nonNull(user) && passwordValidator.passwordValidate(userDto.getPassword(), user)) {
            log.info("Mapper debug :" + modelMapper.map(user, UserDto.class));
        }
        return modelMapper.map(user, UserDto.class);
    }


    public UserDto signUpUser(UserDto userDto) {
        User user = new User();
        Optional<User> optionalUser = userRepository.findUserByEmail(userDto.getEmail());
        if (optionalUser.isPresent()) {
            throw new RuntimeServiceException("User with this email already registered! Please, choose SignIn form for authentication or use another email");
        } else {
            user = modelMapper.map(userDto, User.class);
            log.info("User mapped from UserDto: " + user);
            user.setRole(RoleType.VISITOR);
            user.setLanguage(LangType.uk_UA);
            /*IPasswordHashing hashing = PasswordHashing.getInstance();*/
            byte[] salt = passwordHashing.saltGenerator();
            byte[] pass = passwordHashing.hashGenerator(userDto.getPassword(), salt);
            user.setSalt(salt);
            user.setPassword(pass);
            user = userRepository.save(user);
            log.info("userRepository.save(user)" + user);
        }
        return modelMapper.map(user, UserDto.class);
    }
}

