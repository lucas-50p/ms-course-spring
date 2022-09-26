package com.lucas.payroll.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.lucas.payroll.entities.Worker;

/*
 * Interface vai declarar o tipo de chamada webServices que vou fazer
 * 
 * */

@Component // Será gerenciado pelo Spring, vai ser injetado para outras classes
@FeignClient(name = "hr-worker", path= "/workers")
public interface WorkerFeignclient {

	// Ele procurar o trabalhador pelo ID.
	@GetMapping(value = "/{id}")
	ResponseEntity<Worker> findByid(@PathVariable Long id);// PathVariable - para que Id do parametro seja reconhecido pela variavel
}
