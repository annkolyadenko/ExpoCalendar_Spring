package ua.com.expo.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.expo.persistence.domain.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
