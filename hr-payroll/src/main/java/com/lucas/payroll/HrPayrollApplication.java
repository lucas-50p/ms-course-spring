package com.lucas.payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient// Já tem balanceamento de carga integrado - add app. Properties add o caminho(eureka.client.service-url.defaultZone=http://localhost:8761/eureka)
@EnableFeignClients
@SpringBootApplication
public class HrPayrollApplication {
	
	/*
	 * O servidor EUREKA vai tratar de registrar todas as instâncias caso seja mais de uma.
	 * Quando precisar de um micro serviço, chama o micro serviço apenas pelo nome.
	 * Tudo vai ser automático
	 */
	
	/*
	 * Para fazer comunicação de um projeto com outros, usando "Feign"
	 * Primeira coisa fazer é declarar a interface com assinaturas da requisoes que posso fazer
	 * Vantagem que vai esta integrado com as outras ferramentas do Spring Cloud.
	 * */
	
	/*
    Ribbon - Balanceador de cargas.
	Que pode levantar mais de uma inatância do mesmo projeto.
	Quando um projeto fizer uma requisão para outro projeto.
	Quando um projeto fizer uma requição para outro projeto, que tem mais de uma instância levantada.
	Vai haver um balancemento de carga ou seja, 
	instância E isso forma alternada, equilibrando, balanceando assim o volume de requições para aquele projeto.
	* */
	public static void main(String[] args) {
		SpringApplication.run(HrPayrollApplication.class, args);
	}
}
