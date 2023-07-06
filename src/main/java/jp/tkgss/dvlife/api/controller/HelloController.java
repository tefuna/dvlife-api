package jp.tkgss.dvlife.api.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * aaa.
 *
 * @author tefuna
 */
@RestController
@Slf4j
// @RequestMapping(valu.e = "/", method = RequestMethod.GET)
public class HelloController {

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
