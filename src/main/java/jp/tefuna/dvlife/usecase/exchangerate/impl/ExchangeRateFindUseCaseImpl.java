package jp.tefuna.dvlife.usecase.exchangerate.impl;

import jp.tefuna.dvlife.domain.model.exchangerate.ExchangeRate;
import jp.tefuna.dvlife.domain.model.exchangerate.RateId;
import jp.tefuna.dvlife.domain.repository.ExchangeRateRepository;
import jp.tefuna.dvlife.usecase.exchangerate.ExchangeRateFindUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ExchangeRateFindUseCaseImpl.
 */
@Service
public class ExchangeRateFindUseCaseImpl implements ExchangeRateFindUseCase {

    private final ExchangeRateRepository exchangeRateRepository;

    @Autowired
    public ExchangeRateFindUseCaseImpl(ExchangeRateRepository exchangeRateRepository) {
        this.exchangeRateRepository = exchangeRateRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public ExchangeRate findByRateId(int rateId) {

        final RateId id = new RateId(rateId);

        ExchangeRate exchangeRate = exchangeRateRepository.findByRateId(id);
        return exchangeRate;

        // return ExchangeRateDto.builder()
        // .rateId(111)
        // .baseDate(OffsetDateTime.now())
        // .currency(Currency.getInstance(Locale.JAPAN))
        // .rateOrigin(RateOrigin.GENERAL)
        // .rate(BigDecimal.valueOf(155.55))
        // .build();

    }

}
