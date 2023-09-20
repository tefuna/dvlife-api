package jp.tefuna.dvlife.infrastructure.db.mapper;

import jp.tefuna.dvlife.domain.model.exchangerate.ExchangeRate;
import jp.tefuna.dvlife.domain.model.exchangerate.RateId;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ExchangeRateMapper {

    ExchangeRate findByRateId(@Param("rateId") RateId rateId);

}
