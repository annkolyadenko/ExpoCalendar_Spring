package ua.com.expo.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import ua.com.expo.persistence.entity.enums.RoleType;

import javax.persistence.*;
import javax.validation.constraints.Email;


@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class User extends AbstractEntity<Long> {

    @NonNull
    @Enumerated(value = EnumType.STRING)
    private RoleType type;
    private String name;
    @NonNull
    @Email
    private String email;
    private String language;
    @NonNull
    @Lob
    private byte[] password;
    @NonNull
    @Lob
    private byte[] salt;

}
