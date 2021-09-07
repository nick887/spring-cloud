package icu.nickxiao.springcloud.dao;

import static icu.nickxiao.springcloud.dao.PaymentDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import icu.nickxiao.springcloud.entity.Payment;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface PaymentMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: payment")
    BasicColumn[] selectList = BasicColumn.columnList(id, serial);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: payment")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: payment")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: payment")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Payment> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: payment")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Payment> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: payment")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PaymentResult")
    Optional<Payment> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: payment")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PaymentResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="serial", property="serial", jdbcType=JdbcType.VARCHAR)
    })
    List<Payment> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: payment")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: payment")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, payment, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: payment")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, payment, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: payment")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: payment")
    default int insert(Payment record) {
        return MyBatis3Utils.insert(this::insert, record, payment, c ->
            c.map(id).toProperty("id")
            .map(serial).toProperty("serial")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: payment")
    default int insertMultiple(Collection<Payment> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, payment, c ->
            c.map(id).toProperty("id")
            .map(serial).toProperty("serial")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: payment")
    default int insertSelective(Payment record) {
        return MyBatis3Utils.insert(this::insert, record, payment, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(serial).toPropertyWhenPresent("serial", record::getSerial)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: payment")
    default Optional<Payment> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, payment, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: payment")
    default List<Payment> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, payment, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: payment")
    default List<Payment> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, payment, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: payment")
    default Optional<Payment> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: payment")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, payment, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: payment")
    static UpdateDSL<UpdateModel> updateAllColumns(Payment record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(serial).equalTo(record::getSerial);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: payment")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Payment record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(serial).equalToWhenPresent(record::getSerial);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: payment")
    default int updateByPrimaryKey(Payment record) {
        return update(c ->
            c.set(serial).equalTo(record::getSerial)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: payment")
    default int updateByPrimaryKeySelective(Payment record) {
        return update(c ->
            c.set(serial).equalToWhenPresent(record::getSerial)
            .where(id, isEqualTo(record::getId))
        );
    }
}