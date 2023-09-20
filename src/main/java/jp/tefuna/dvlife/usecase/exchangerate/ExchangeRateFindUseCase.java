package jp.tefuna.dvlife.usecase.exchangerate;

import jp.tefuna.dvlife.domain.model.exchangerate.ExchangeRate;

public interface ExchangeRateFindUseCase {

    ExchangeRate findByRateId(int rateId);

}
