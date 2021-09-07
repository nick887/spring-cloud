package icu.nickxiao;

import icu.nickxiao.springcloud.assembler.PaymentStructkit;
import icu.nickxiao.springcloud.dto.PaymentDto;
import icu.nickxiao.springcloud.entity.Payment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author nick
 * @version 1.0, 2021/9/7
 * @since 1.0.0
 */
@SpringBootTest
public class test {
    @Autowired
    private PaymentStructkit structkit;
    @Test
    public void foo()
    {
        Payment asdf = structkit.toEntity(PaymentDto.builder().id(1L).serial("asdf").build());
        System.out.println(asdf);
    }
}
