package icu.nickxiao.springcloud.model.service;

import icu.nickxiao.springcloud.dto.PaymentDto;
import icu.nickxiao.springcloud.entity.Payment;

import java.util.Optional;

/**
 * @author nick
 * @version 1.0, 2021/9/7
 * @since 1.0.0
 */
public interface IPaymentModelService {
    int create(Payment payment);
    Optional<Payment> getPaymentById(Long id);
}
