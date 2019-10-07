package ua.com.expo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Long id;
    private String role;
    @NotNull
    @NotBlank(message = "Name is mandatory")
    @Size(min = 4, max = 16)
    private String name;
    @NotNull
    @NotBlank(message = "Email is mandatory")
    @Email
    private String email;
    private String language;
    @NotNull
    @NotBlank(message = "Password is mandatory")
    @Size(min = 4, max = 20)
    private String password;

}
