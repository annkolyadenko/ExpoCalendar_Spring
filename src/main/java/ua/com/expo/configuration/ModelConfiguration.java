package ua.com.expo.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.com.expo.tag.UserRoleTag;
import ua.com.expo.util.security.IPasswordHashing;
import ua.com.expo.util.security.impl.PasswordHashing;
import ua.com.expo.util.validator.IPasswordValidator;
import ua.com.expo.util.validator.impl.PasswordValidator;

@Configuration
public class ModelConfiguration {

    @Bean
    public ModelMapper modelMapper() {
       return new ModelMapper();
    }

    @Bean
    public IPasswordHashing passwordHashing(){
        return new PasswordHashing();
    }

    @Bean
    public UserRoleTag userRoleTag() {
        return new UserRoleTag();
    }

    @Bean
    public IPasswordValidator passwordValidator() {
        return new PasswordValidator();
    }
}
