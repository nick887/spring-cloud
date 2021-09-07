package icu.nickxiao.springcloud.dao;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PaymentDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: payment")
    public static final Payment payment = new Payment();

    /**
     * Database Column Remarks:
     *   id
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: payment.id")
    public static final SqlColumn<Long> id = payment.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: payment.serial")
    public static final SqlColumn<String> serial = payment.serial;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: payment")
    public static final class Payment extends SqlTable {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> serial = column("serial", JDBCType.VARCHAR);

        public Payment() {
            super("payment");
        }
    }
}