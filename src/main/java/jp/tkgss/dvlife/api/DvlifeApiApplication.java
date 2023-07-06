package jp.tkgss.dvlife.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * aaa.
 *
 * @author aaa
 */
@RestController
@SpringBootApplication
@Slf4j
// @ComponentScan("jp.tkgss.dvlife.api.controller")
public class DvlifeApiApplication {

    @RequestMapping("/aa")
    public String hello(final String hello) {
        return "Hello world:" + hello;
    }

    public static void main(String[] args) {
        log.debug("★★★★★★debug logs");
        DvlifeApiApplication main = new DvlifeApiApplication();
        main.name();

        SpringApplication.run(DvlifeApiApplication.class, args);
    }

    /**
     *
     */
    public void name() {
        System.out.println("aaa");

        String a = "testetstse";
        Aaa aaa = Aaa.builder().test(a).build();
        System.out.println(aaa.getTest() + "              aaaaaaaaaaaaaaaaaaaaaaaaa");
        aaa.hello("abbbbbbbbbbbbbbbb");

    }

}
