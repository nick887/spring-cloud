package icu.nickxiao.springcloud.model.service.impl;

import icu.nickxiao.springcloud.assembler.PaymentStructkit;
import icu.nickxiao.springcloud.dao.PaymentMapper;
import icu.nickxiao.springcloud.dto.PaymentDto;
import icu.nickxiao.springcloud.entity.Payment;
import icu.nickxiao.springcloud.model.service.IPaymentModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import static icu.nickxiao.springcloud.dao.PaymentDynamicSqlSupport.id;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.Optional;

/**
 * @author nick
 * @version 1.0, 2021/9/7
 * @since 1.0.0
 */
@Service
@RequiredArgsConstructor
public class PaymentModelServiceImpl implements IPaymentModelService {
    private final PaymentMapper mapper;
    private final PaymentStructkit structkit;
    @Override
    public int create(Payment payment) {
        return this.mapper.insertSelective(payment);
    }

    @Override
    public Optional<Payment> getPaymentById(Long nid) {
        return this.mapper.selectOne(c -> c.where(id,isEqualTo(nid)));
    }
}
