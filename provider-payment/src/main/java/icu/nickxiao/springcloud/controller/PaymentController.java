package icu.nickxiao.springcloud.controller;

import icu.nickxiao.springcloud.dto.PaymentDto;
import icu.nickxiao.springcloud.entity.Payment;
import icu.nickxiao.springcloud.model.service.IPaymentModelService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * @author nick
 * @version 1.0, 2021/9/7
 * @since 1.0.0
 */
@RestController
@Slf4j
@RequiredArgsConstructor
public class PaymentController {
    private  final IPaymentModelService paymentModelService;
    @RequestMapping("/create")
    public Integer create(@RequestBody Payment payment) {
        return paymentModelService.create(payment);
    }

    @RequestMapping("/getById/{id}")
    public Payment getById(@PathVariable("id") Long id){
        Optional<Payment> paymentDtoOptional = paymentModelService.getPaymentById(id);
        return paymentDtoOptional.isPresent()?
                paymentDtoOptional.get():null;
    }
}
