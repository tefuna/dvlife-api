package jp.tefuna.dvlife.infrastructure.db;

import jp.tefuna.dvlife.domain.model.exchangerate.ExchangeRate;
import jp.tefuna.dvlife.domain.model.exchangerate.RateId;
import jp.tefuna.dvlife.domain.repository.ExchangeRateRepository;
import jp.tefuna.dvlife.infrastructure.db.mapper.ExchangeRateMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ExchangeRateRepositoryImpl implements ExchangeRateRepository {

    private final ExchangeRateMapper mapper;

    @Override
    public ExchangeRate findByRateId(RateId rateId) {
        ExchangeRate result = this.mapper.findByRateId(rateId);
        return result;
    }
}
