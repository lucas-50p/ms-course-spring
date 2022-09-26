package com.lucas.payroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.lucas.payroll.entities.Payment;
import com.lucas.payroll.entities.Worker;

@Service
public class PaymentService {
	
	// Propriedade criada no application properties, para não precisar colocar todo http host
	@Value("${hr.worker.host}")
	private String workerHost;
	
	@Autowired
	private RestTemplate restTemplate;

	public Payment getPayment(long workerId, int days) {
		
		// MAP ele somente uma interface
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", ""+workerId);
		
		// Requisão para API externar usando REST template. Worker.class porque tipo esta declarado na class worker
		Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);
		
		// Preenchimento dinâmico do trabalhador, fazendo requisão para outro projeto worker
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
