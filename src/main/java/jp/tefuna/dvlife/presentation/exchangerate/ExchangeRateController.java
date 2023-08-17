package jp.tefuna.dvlife.presentation.exchangerate;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import jp.tefuna.dvlife.domain.code.RateOrigin;
import jp.tefuna.dvlife.presentation.BaseController;
import jp.tefuna.dvlife.presentation.GeneralResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ExchangeRateController.
 *
 * @author tefuna
 */
@RestController
@Slf4j
public class ExchangeRateController extends BaseController {

    private static final String PATH = "/exchange-rates";

    /**
     * hello endpoint.
     *
     * @param hello string
     * @return view
     */
    @RequestMapping(value = PATH, method = RequestMethod.GET)
    public GeneralResponse<ExchangeRateResponse> getExchangeRate(
            @RequestParam(name = "from", required = false) final Optional<String> from,
            @RequestParam(name = "to", required = false) final Optional<String> to) {

        log.debug("hello : %s", "aaa");

        ExchangeRateResponse response = new ExchangeRateResponse();
        response.setBaseDate(ZonedDateTime.now());
        response.setCurrency(Currency.getInstance(Locale.JAPAN));
        response.setRateOrigin(RateOrigin.REPORT);
        response.setRate(BigDecimal.ONE);

        GeneralResponse<ExchangeRateResponse> res = new GeneralResponse<>();
        res.setResult(response);

        return res;
    }


}
