package jp.tefuna.dvlife.domain.repository;

import jp.tefuna.dvlife.domain.model.exchangerate.ExchangeRate;
import jp.tefuna.dvlife.domain.model.exchangerate.RateId;

/**
 * 
 */
public interface ExchangeRateRepository {

    ExchangeRate findByRateId(RateId rateId);

}