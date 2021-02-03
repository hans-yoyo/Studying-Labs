package io.hans.coder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "io.hans.coder")
public class SpringbootBasisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBasisApplication.class, args);
    }

}
