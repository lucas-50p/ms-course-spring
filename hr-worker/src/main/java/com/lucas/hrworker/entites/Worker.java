package com.lucas.hrworker.entites;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *  Imports: javax - interface e o hibernate - é implementação
 *  Vc programa para interface e não para implementação especifica
 * */
//Mapeamento JPA para uma tabela do banco dados relacional
@Entity
@Table(name = "tb_worker")
public class Worker implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id//Chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)// para ID que seja gerado automaticamente no banco de dados
	private Long id;
	private String name;
	private Double dailyIncome;
	
	public Worker() {
	}
	
	public Worker(Long id, String name, Double dailyIncome) {
		super();
		this.id = id;
		this.name = name;
		this.dailyIncome = dailyIncome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		return Objects.equals(id, other.id);
	}

}
