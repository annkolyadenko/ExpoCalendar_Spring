package ua.com.expo.persistence.springdata;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ua.com.expo.persistence.IPayment;
import ua.com.expo.persistence.entity.Payment;
import ua.com.expo.persistence.repository.PaymentRepository;

@Repository
@AllArgsConstructor
public class PaymentImpl implements IPayment {

    private PaymentRepository paymentRepository;

    @Override
    public Payment save(Payment payment) {
        return paymentRepository.save(payment);
    }
}
