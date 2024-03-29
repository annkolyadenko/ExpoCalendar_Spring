package ua.com.expo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ExpoCalendarApplication {

    public static void main(String[] args) {

        SpringApplication.run(ExpoCalendarApplication.class, args);
        log.info("Hello Spring Boot");
    }

}
