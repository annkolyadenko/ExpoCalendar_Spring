package ua.com.expo.persistence.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import ua.com.expo.persistence.domain.enums.LangType;
import ua.com.expo.persistence.domain.enums.RoleType;

import javax.persistence.*;
import javax.validation.constraints.Email;


@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class User extends AbstractEntity<Long> {

    @Enumerated(value = EnumType.STRING)
    private RoleType role;
    private String name;
    @NonNull
    @Email
    private String email;
    @Enumerated(value = EnumType.STRING)
    private LangType language;
    @NonNull
    @Lob
    private byte[] password;
    @NonNull
    @Lob
    private byte[] salt;

}
