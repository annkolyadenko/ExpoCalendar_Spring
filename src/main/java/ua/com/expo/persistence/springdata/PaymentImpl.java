package ua.com.expo.persistence.springdata;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ua.com.expo.persistence.IPayment;
import ua.com.expo.persistence.domain.Payment;
import ua.com.expo.persistence.repository.PaymentRepository;

@Repository
@AllArgsConstructor
public class PaymentImpl implements IPayment {

    private final PaymentRepository paymentRepository;

    @Override
    public Payment save(Payment payment) {
        return paymentRepository.save(payment);
    }
}
