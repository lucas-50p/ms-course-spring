package com.lucas.payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class HrPayrollApplication {
	
	/*
	 * Para fazer comunicação de um projeto com outros, usando "Feign"
	 * Primeira coisa fazer é declarar a interface com assinaturas da requisoes que posso fazer
	 * Vantagem que vai esta integrado com as outras ferramentas do Spring Cloud.
	 * */

	public static void main(String[] args) {
		SpringApplication.run(HrPayrollApplication.class, args);
	}

}
