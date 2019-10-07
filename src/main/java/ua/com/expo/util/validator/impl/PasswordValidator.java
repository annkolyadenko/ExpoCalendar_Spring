package ua.com.expo.util.validator.impl;

import ua.com.expo.persistence.domain.User;
import ua.com.expo.util.security.IPasswordHashing;
import ua.com.expo.util.security.impl.PasswordHashing;
import ua.com.expo.util.validator.IPasswordValidator;

import java.util.Arrays;

public class PasswordValidator implements IPasswordValidator {

    private final IPasswordHashing hashing = PasswordHashing.getInstance();

    @Override
    public boolean passwordValidate(String password, User user) {
        byte[] salt = user.getSalt();
        return Arrays.equals(hashing.hashGenerator(password, salt), (user.getPassword()));
    }
}
