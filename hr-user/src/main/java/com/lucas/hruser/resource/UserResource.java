package com.lucas.hruser.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.hruser.entities.User;
import com.lucas.hruser.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")//Caminho padrão
public class UserResource {

	// Retornar todos os trabalhadores, que estão no banco de dados
	@Autowired
	private UserRepository repository;

	// Ele procurar o trabalhador pelo ID.
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findByid(@PathVariable Long id) {
		
		User obj = repository.findById(id).get();

		// OK - requisão foi feita com sucesso
		return ResponseEntity.ok(obj);
	}
	
	// Exemplo: Search?email=nina@gmail.com
	@GetMapping(value = "/search")
	public ResponseEntity<User> findByid(@RequestParam String email) {

		User obj = repository.findByEmail(email);

		// OK - requisão foi feita com sucesso
		return ResponseEntity.ok(obj);
	}
}
