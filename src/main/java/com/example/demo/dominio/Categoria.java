package com.example.demo.dominio;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name="categoria")
public class Categoria {

	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	private String denominacao;
	
	private boolean ativo;

	@ManyToOne(fetch=FetchType.LAZY)
	private GrupoCategoria grupoCategoria;
	

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

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public GrupoCategoria getGrupoCategoria() {
		return grupoCategoria;
	}
	public void setGrupoCategoria(GrupoCategoria grupoCategoria) {
		this.grupoCategoria = grupoCategoria;
	}
	
}
