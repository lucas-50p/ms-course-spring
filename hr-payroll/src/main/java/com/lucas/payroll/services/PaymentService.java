package com.lucas.payroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.payroll.entities.Payment;
import com.lucas.payroll.entities.Worker;
import com.lucas.payroll.feignclient.WorkerFeignclient;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignclient workerFeignCliente;

	public Payment getPayment(long workerId, int days) {
		
		// Requisão para API externar usando REST template. Worker.class porque tipo esta declarado na class worker
		Worker worker = workerFeignCliente.findByid(workerId).getBody();
		
		// Preenchimento dinâmico do trabalhador, fazendo requisão para outro projeto worker
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
