package ua.com.expo.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


public class EmailExistsException extends RuntimeException {

    public EmailExistsException() {
    }

    public EmailExistsException(String message) {
        super(message);
    }

    public EmailExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmailExistsException(Throwable cause) {
        super(cause);
    }
}
