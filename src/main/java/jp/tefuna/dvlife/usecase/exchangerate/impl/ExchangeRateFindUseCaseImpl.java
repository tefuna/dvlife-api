package jp.tefuna.dvlife.usecase.exchangerate.impl;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Currency;
import java.util.Locale;

import jp.tefuna.dvlife.domain.code.RateOrigin;
import jp.tefuna.dvlife.domain.model.exchangerate.ExchangeRate;
import jp.tefuna.dvlife.domain.model.exchangerate.RateId;
import jp.tefuna.dvlife.domain.repository.ExchangeRateRepository;
import jp.tefuna.dvlife.usecase.exchangerate.ExchangeRateFindUseCase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
