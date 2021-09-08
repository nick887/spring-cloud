package icu.nickxiao.springcloud.controller;

import com.netflix.appinfo.InstanceInfo;
import icu.nickxiao.springcloud.entity.Payment;
import icu.nickxiao.springcloud.model.service.IPaymentModelService;
import icu.nickxiao.springcloud.service.IPaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
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
    private  final IPaymentService paymentService;
    private final DiscoveryClient discoveryClient;
    @RequestMapping("/create")
    public Integer create(@RequestBody Payment payment) {
        return paymentService.create(payment);
    }

    @RequestMapping("/getById/{id}")
    public Payment getById(@PathVariable("id") Long id){
       return paymentService.getById(id);
    }

    @RequestMapping("/discovery")
    public Object discoveryClient(){
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instanceInfo:instances){
            log.info("instance {} {} {}",instanceInfo.getServiceId(),instanceInfo.getHost(),instanceInfo.getPort());
        }
        return null;
    }
}
