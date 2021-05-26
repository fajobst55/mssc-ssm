package guru.springframework.msscssm.services;

import guru.springframework.msscssm.domain.Payment;
import guru.springframework.msscssm.domain.PaymentEvent;
import org.springframework.statemachine.StateMachine;

public interface PaymentService {

    Payment newPayment(Payment payment);

    StateMachine<PaymentService, PaymentEvent> preAuth(Long paymentId);

    StateMachine<PaymentService, PaymentEvent> authorizePayment(Long paymentId);

    StateMachine<PaymentService, PaymentEvent> declineAuth(Long paymentId);

}
