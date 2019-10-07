package ua.com.expo.util.validator;

import ua.com.expo.persistence.domain.User;

public interface IPasswordValidator {

    boolean passwordValidate(String password, User user);
}
