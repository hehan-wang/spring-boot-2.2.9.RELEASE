package com.lagou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lagou.mapper")
public class Springboot03DataaccessApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot03DataaccessApplication.class, args);
	}

}
