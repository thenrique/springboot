package com.example.demo.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="grupo_categoria")
public class GrupoCategoria {

	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	private String denominacao;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDenominacao() {
		return denominacao;
	}

	public void setDenominacao(String denominacao) {
		this.denominacao = denominacao;
	}
	
}
