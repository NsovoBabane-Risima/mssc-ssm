package guru.framework.msscssm.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder 
@Entity
public class Payment {

	private Long id;

	@Enumerated(EnumType.STRING)
	private PaymentState paymentState;
	private BigDecimal amount;
}
