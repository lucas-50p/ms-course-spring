package com.lucas.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	// Buscar
	User findByEmail(String email);
}
