package jp.tefuna.dvlife.presentation.stock;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * StockController.
 *
 * @author tefuna
 */
@RestController
public class StockController {

    private final 

    public String aaa;

    /**
     * hello endpoint.
     *
     * @param hello string
     * @return view
     */
    @RequestMapping()
    public String hello(final String hello) {

        log.debug("hello", hello);

        final String bbb = "aaa";
        switch (bbb) {
            case "aaa":
                break;
            default:
                throw new IllegalAccessError();

        }

        return "Hello world:" + hello;

    }
}
