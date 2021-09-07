package icu.nickxiao.cloud.controller;

import icu.nickxiao.cloud.entity.Payment;
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
    private final RestTemplate restTemplate;

    public static final String URL_PREFIX="http://CLOUD-PAYMENT-SERVICE";

    @RequestMapping("/create")
    public int create(@RequestBody Payment payment){
        return restTemplate.postForObject(URL_PREFIX+"/create",payment,Integer.class);
    }


    @RequestMapping("/getById/{id}")
    public Payment getPayment(@PathVariable("id") Long id){
        log.info("yes");
        return restTemplate.getForObject(URL_PREFIX+"/getById/"+id,Payment.class);
    }
}
