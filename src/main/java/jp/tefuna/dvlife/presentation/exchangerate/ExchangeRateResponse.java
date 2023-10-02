package jp.tefuna.dvlife.presentation.exchangerate;

import java.math.BigDecimal;

import lombok.Data;

/**
 * ExchangeRateResponse.
 *
 * @author tefuna
 */
@Data
public class ExchangeRateResponse {

    private int rateId;
    private String baseDate;
    private String currency;
    private String rateOrigin;
    private BigDecimal rate;

}
