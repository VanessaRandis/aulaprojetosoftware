package com.projetoaula.praticando.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "tb_curso")// mapeamento especificando o que vai ser dentro da tabela
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto encrement automa
	private Long id;
	private String nomeCurso;
	
	
	public Curso() {

	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	
}//fazer uma classe aluno igual
