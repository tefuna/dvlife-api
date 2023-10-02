package jp.tefuna.dvlife;

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
public class Application {

    @RequestMapping("/aa")
    public String hello(final String hello) {
        return "Hello world:" + hello;
    }

    public static void main(String[] args) {
        log.debug("★★★★★★debug logs");
        Application main = new Application();
        main.name();

        SpringApplication.run(Application.class, args);
    }

    /**
     *
     */
    public void name() {
        System.out.println("aaa");

        String a = "testetstse";
        // Aaa aaa = Aaa.builder().test(a).build();
        // System.out.println(aaa.getTest() + " aaaaaaaaaaaaaaaaaaaaaaaaa");
        // aaa.hello("abbbbbbbbbbbbbbbb");

    }

}
