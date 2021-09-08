package icu.nickxiao.cloud.service;

import icu.nickxiao.cloud.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author nick
 * @version 1.0, 2021/9/9
 * @since 1.0.0
 */
@Service
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @RequestMapping("/create")
    public Integer create(@RequestBody Payment payment);

    @RequestMapping("/getById/{id}")
    public Payment getById(@PathVariable("id") Long id);
}
