package jp.tefuna.dvlife.presentation.exchangerate;

import java.time.format.DateTimeFormatter;
import java.util.Optional;

import jp.tefuna.dvlife.domain.model.exchangerate.ExchangeRate;
import jp.tefuna.dvlife.presentation.BaseController;
import jp.tefuna.dvlife.presentation.GeneralResponse;
import jp.tefuna.dvlife.usecase.exchangerate.ExchangeRateFindUseCase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    private ExchangeRateFindUseCase exchangeRateFindUseCase;

    @Autowired
    public ExchangeRateController(ExchangeRateFindUseCase exchangeRateFindUseCase) {
        this.exchangeRateFindUseCase = exchangeRateFindUseCase;
    }

    @GetMapping(value = PATH + "/{rateId}")
    public GeneralResponse<ExchangeRateResponse> getExchangeRateById(@PathVariable final String rateId) {

        // TODO バリデーション
        

        // UseCase実行
        ExchangeRate out = this.exchangeRateFindUseCase.findByRateId(Integer.parseInt(rateId));

        // TODO MapStructに変更
        ExchangeRateResponse res = new ExchangeRateResponse();
        res.setRateId(out.getRateId().getRateId());
        res.setBaseDate(out.getBaseDate().getBaseDate().format(DateTimeFormatter.ISO_LOCAL_DATE));
        res.setCurrency(out.getCurrency().getCurrencyCode());
        res.setRateOrigin(out.getRateOrigin().getCode());
        res.setRate(out.getRate());

        return respond(res);
    }

    /**
     * hello endpoint.
     *
     * // * @param hello string
     *
     * @return view
     */
    @RequestMapping(value = PATH, method = RequestMethod.GET)
    public GeneralResponse<ExchangeRateResponse> getExchangeRateByByBaseDate(
            @RequestParam(name = "from", required = false) final Optional<String> from,
            @RequestParam(name = "to", required = false) final Optional<String> to) {

        log.debug("hello : %s", "aaa");

        ExchangeRateResponse response = new ExchangeRateResponse();
        // response.setBaseDate(OffsetDateTime.now());
        // response.setCurrency(Currency.getInstance(Locale.JAPAN));
        // response.setRateOrigin(RateOrigin.REPORT);
        // response.setRate(BigDecimal.ONE);

        GeneralResponse<ExchangeRateResponse> res = new GeneralResponse<>();
        res.setResult(response);

        return res;
    }

}
