package com.b1uesoda.myo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // created_at, updated_at 자동 업데이트
@SpringBootApplication
public class MyoApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyoApplication.class, args);
    }
}
