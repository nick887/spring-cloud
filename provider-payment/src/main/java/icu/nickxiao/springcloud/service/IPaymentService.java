package icu.nickxiao.springcloud.service;

import icu.nickxiao.springcloud.entity.Payment;

/**
 * @author nick
 * @version 1.0, 2021/9/9
 * @since 1.0.0
 */
public interface IPaymentService {
    int create(Payment payment);
    Payment getById(Long id);
}
