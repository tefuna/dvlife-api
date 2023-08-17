package jp.tefuna.dvlife.presentation.exchangerate;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Currency;

import jp.tefuna.dvlife.domain.code.RateOrigin;
import lombok.Data;

/**
 * ExchangeRateResponse.
 *
 * @author tefuna
 */
@Data
public class ExchangeRateResponse {

    private ZonedDateTime baseDate;
    private Currency currency;
    private RateOrigin rateOrigin;
    private BigDecimal rate;

}
