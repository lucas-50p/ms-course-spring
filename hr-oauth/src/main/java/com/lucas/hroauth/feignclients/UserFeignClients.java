package com.lucas.hroauth.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lucas.hroauth.entities.User;

@Component
@FeignClient(name = "hr-user", path= "/users")//O nome do mricro serviço quero me comunicar
public interface UserFeignClients {
	
	// Exemplo: Search?email=nina@gmail.com
	@GetMapping(value = "/search")
	ResponseEntity<User> findByEmail(@RequestParam String email);
}
