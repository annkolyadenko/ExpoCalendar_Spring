package ua.com.expo.persistence;

import ua.com.expo.persistence.domain.Payment;

public interface IPayment {

    Payment save(Payment payment);

}
