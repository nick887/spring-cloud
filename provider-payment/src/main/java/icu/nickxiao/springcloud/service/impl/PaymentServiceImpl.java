package icu.nickxiao.springcloud.service.impl;

import icu.nickxiao.springcloud.entity.Payment;
import icu.nickxiao.springcloud.model.service.IPaymentModelService;
import icu.nickxiao.springcloud.service.IPaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author nick
 * @version 1.0, 2021/9/9
 * @since 1.0.0
 */
@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements IPaymentService {
    private  final IPaymentModelService paymentModelService;
    @Override
    public int create(Payment payment) {
        return paymentModelService.create(payment);
    }

    @Override
    public Payment getById(Long id) {
        Optional<Payment> paymentDtoOptional = paymentModelService.getPaymentById(id);
        return paymentDtoOptional.isPresent()?
                paymentDtoOptional.get():null;
    }
}
