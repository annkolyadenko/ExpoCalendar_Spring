package ua.com.expo.presentation;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user_path")
@AllArgsConstructor
public class UserController {


    public String index() {
        return "Hello Spring Boot!";
    }
}
