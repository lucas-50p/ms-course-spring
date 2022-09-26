package com.lucas.payroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	
	/*
	 *  server para registrar uma instaância unica singleton do tipo obj
	 *  essa instância ficarar disponivel para eu injetar em outros componentes.
	 *  Criar um componente na chamada metodo. para injeter em outros servicos.
	 */
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
