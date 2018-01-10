package com.example.demo.dominio;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema="comum",name="material")
public class Material {

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(schema="comum",sequenceName="material_seq", name = "material_seq")
	private int id;
	
	private String denominacao;
	
	private Double valor;
	
	private boolean ativo;
	
	@ManyToOne(fetch=FetchType.LAZY,targetEntity=Categoria.class)
	@JoinColumn(name="idCategoria",referencedColumnName="id",foreignKey = @ForeignKey(name="FK_idCateogira"))
	private Categoria categoria;

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

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
	
}
