package ua.com.expo.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name="expos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Expo extends AbstractEntity<Long> {

    @ManyToOne
    @JoinColumn(name="showroom_id")
    private Showroom showroom;
    @ManyToOne
    @JoinColumn(name="theme_id")
    private Theme theme;
    @NonNull
    private Instant date;
    @NonNull
    private BigDecimal price;
    private String info;

}
