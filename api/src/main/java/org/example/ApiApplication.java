package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 目錄結構也改為 org.example，就不需要自己設定 ComponentScan 了
 */
@SpringBootApplication
//@ComponentScan(basePackages = "org.example") // 讓 api 模組可以 scan 到 domain 那層
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

}
