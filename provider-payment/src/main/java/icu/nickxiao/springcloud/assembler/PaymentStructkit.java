package icu.nickxiao.springcloud.assembler;

import icu.nickxiao.springcloud.dto.PaymentDto;
import icu.nickxiao.springcloud.entity.Payment;
import org.mapstruct.Mapper;

/**
 * @author nick
 * @version 1.0, 2021/9/7
 * @since 1.0.0
 */
@Mapper(componentModel = "spring")
public interface PaymentStructkit {
    PaymentDto toDto(Payment payment);
    Payment toEntity(PaymentDto dto);
}
