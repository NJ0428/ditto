package com.ditto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // 날짜 업데이트
@SpringBootApplication
public class DittoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DittoApplication.class, args);
	}

}
