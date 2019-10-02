package ua.com.expo.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name="tickets")
@Data
@NoArgsConstructor
public class Ticket extends AbstractEntity<Long> {

    @ManyToOne
    @JoinColumn(name="expo_id")
    private Expo expo;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
    @OneToOne
    @JoinColumn(name="payment_id")
    private Payment payment;
    @NonNull
    private Instant time;
    @NonNull
    private Long amount;
    private String info;

}
