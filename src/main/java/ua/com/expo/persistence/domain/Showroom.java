package ua.com.expo.persistence.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@Table(name="showrooms")
@Data
@NoArgsConstructor
public class Showroom extends AbstractEntity<Long> {

    @NonNull
    private String name;
    private String info;

}
