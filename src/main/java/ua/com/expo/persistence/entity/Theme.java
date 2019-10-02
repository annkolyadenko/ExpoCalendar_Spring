package ua.com.expo.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@Table(name="themes")
@Data
@NoArgsConstructor
public class Theme extends AbstractEntity<Long> {

    @NonNull
    private String name;

}
