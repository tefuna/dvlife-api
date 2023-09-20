package jp.tefuna.dvlife.domain.model.exchangerate;

import java.math.BigDecimal;
import java.util.Currency;

import jp.tefuna.dvlife.domain.code.RateOrigin;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ExchangeRate {

    private RateId rateId;
    private BaseDate baseDate;
    private Currency currency;
    private RateOrigin rateOrigin;
    private BigDecimal rate;

}
