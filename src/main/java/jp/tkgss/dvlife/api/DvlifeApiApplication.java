package jp.tkgss.dvlife.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DvlifeApiApplication {

    public static void main(String[] args) {
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
        System.out.println(aaa.getTest());

    }

}
