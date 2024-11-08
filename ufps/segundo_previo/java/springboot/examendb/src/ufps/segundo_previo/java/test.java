package springboot.examendb.src.ufps.segundo_previo.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"ufps.segundo_previo.java"})
public class test {

    public static void main(String[] args) {
        SpringApplication.run(test.class, args);
    }
}
