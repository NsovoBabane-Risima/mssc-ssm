package guru.framework.msscssm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import guru.framework.msscssm.domain.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
