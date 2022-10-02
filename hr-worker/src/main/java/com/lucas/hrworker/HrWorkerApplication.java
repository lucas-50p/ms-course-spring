package com.lucas.hrworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HrWorkerApplication {

	/*
	 * O servidor EUREKA vai tratar de registrar todas as instâncias caso seja mais de uma.
	 * Quando precisar de um micro serviço, chama o micro serviço apenas pelo nome.
	 * Tudo vai ser automático
	 */
	
	/*
	 * HYSTRIX: permite tratar falhas, serviço esta fora do ar ou Timeout
	 */
	public static void main(String[] args) {
		SpringApplication.run(HrWorkerApplication.class, args);
	}

}
