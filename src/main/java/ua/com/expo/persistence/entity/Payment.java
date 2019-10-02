package ua.com.expo.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="payments")
@Data
@NoArgsConstructor
public class Payment extends AbstractEntity<Long> {

    private BigDecimal value;

}
