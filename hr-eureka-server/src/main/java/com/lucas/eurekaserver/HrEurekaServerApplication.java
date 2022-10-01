package com.lucas.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HrEurekaServerApplication {
	
	/*
	 * O servidor EUREka vai tratar de registrar todas as instâncias caso seja mais de uma.
	 * Quando precisar de um micro serviço, chama o micro serviço apenas pelo nome.
	 * Tudo vai ser automático
	 */
	public static void main(String[] args) {
		SpringApplication.run(HrEurekaServerApplication.class, args);
	}

}
