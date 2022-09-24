package com.lucas.hrworker.recources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
@RestController
@RequestMapping(value = "/workers")//Caminho padrão
public class WorkerResource {
	
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
		Worker obj = repository.findById(id).get();
		
		// OK - requisão foi feita com sucesso
		return ResponseEntity.ok(obj);
	}
}
