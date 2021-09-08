package icu.nickxiao.cloud.controller;

import icu.nickxiao.cloud.entity.Payment;
import icu.nickxiao.cloud.service.PaymentFeignService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author nick
 * @version 1.0, 2021/9/8
 * @since 1.0.0
 */
@RestController
@RequiredArgsConstructor
@Slf4j
public class OrderController {
    private final PaymentFeignService paymentFeignService;


    @RequestMapping("/create")
    public int create(@RequestBody Payment payment){
        return paymentFeignService.create(payment);
    }


    @RequestMapping("/getById/{id}")
    public Payment getPayment(@PathVariable("id") Long id){
        return paymentFeignService.getById(id);
    }
}
