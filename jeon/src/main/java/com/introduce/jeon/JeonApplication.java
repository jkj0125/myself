package com.introduce.jeon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //@EnableAutoConfiguration + @ComponentScan + @Configuration
public class JeonApplication {

	public static void main(String[] args) {
		//스프링부트 기동
		SpringApplication.run(JeonApplication.class, args);
	}

}
