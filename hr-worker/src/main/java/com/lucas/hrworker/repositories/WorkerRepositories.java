package com.lucas.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.hrworker.entites.Worker;

/**
 * Obj que fazer o acesso com banco de dados.
 * Ele vão ter metodos buscar, salvar, apagar, atualizar .....
 * */
public interface WorkerRepositories extends JpaRepository<Worker, Long>{

}
