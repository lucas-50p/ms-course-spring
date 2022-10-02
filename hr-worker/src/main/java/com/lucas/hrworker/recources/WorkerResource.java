package com.lucas.hrworker.recources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.hrworker.entites.Worker;
import com.lucas.hrworker.repositories.WorkerRepositories;

/**
 * Recurso web que vai disponibilizar os endpoints
 * */
/*
 * Balancemento de carga Ribbon - Ele tem tempo de 1 segundo
 */
@RestController
@RequestMapping(value = "/workers")//Caminho padrão
public class WorkerResource {
	
	// Imprimir inform. LOG
	private static Logger logger = LoggerFactory.getLogger(WorkerResource.class);
	
	@Autowired
	private Environment env;
	
	//Retornar todos os trabalhadores, que estão no banco de dados
	@Autowired
	private WorkerRepositories repository;
	
	//obg ele encapsula uma resposta http
	@GetMapping
	public ResponseEntity<List<Worker>> findAll(){
		List<Worker> list = repository.findAll();
		
		// OK - requisão foi feita com sucesso
		return ResponseEntity.ok(list);
	}
	
	// Ele procurar o trabalhador pelo ID. 
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findByid(@PathVariable Long id){// PathVariable - para que Id do parametro seja reconhecido pela variavel
		
		/*
		 * 		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 */

		logger.info("PORT = " + env.getProperty("local.server.port"));
		
		Worker obj = repository.findById(id).get();
		
		// OK - requisão foi feita com sucesso
		return ResponseEntity.ok(obj);
	}
}
