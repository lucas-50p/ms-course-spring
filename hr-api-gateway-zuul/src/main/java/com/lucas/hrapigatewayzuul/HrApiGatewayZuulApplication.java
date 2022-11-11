package com.lucas.hrapigatewayzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class HrApiGatewayZuulApplication {
	
	
	/*
	 * API GATEWAY ZULL: gerenciar e rotear chamadas a partir do nomes dos micro serviços
	 * Idependente de quantas instâncias exista.
	 * Então, a partir de um ponto especifico, vai especificar apenas pelo nome e o end point dele
	 * GATEWAY vai fazer o papel de rotear e encontrar a melhor instância cada micro serviço para atender a requisição
	 */
	public static void main(String[] args) {
		SpringApplication.run(HrApiGatewayZuulApplication.class, args);
	}
}
