package com.projetoaula.praticando.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "tb_aluno")// mapeamento especificando o que vai ser dentro da tabela
public class Aluno {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto encrement automa
	private long id;
	private String nome;
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "curso_id")
	private Curso curso;
	
	public Aluno() {
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	

}
