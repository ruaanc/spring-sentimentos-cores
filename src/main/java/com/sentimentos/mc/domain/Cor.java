package com.sentimentos.mc.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

@Entity
public class Cor implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String nome;
	
	@ElementCollection
    @JoinTable(name = "sentimentos", joinColumns = @JoinColumn(name = "dados_id"))
	private List<String> sentimentos = new ArrayList<String>();
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dados_id")
	private Dados dados;
	
	public Cor() {
	}

	public Cor(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getSentimentos() {
		return sentimentos;
	}

	public void setSentimentos(List<String> sentimentos) {
		this.sentimentos = sentimentos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Dados getDados() {
		return dados;
	}

	public void setDados(Dados dados) {
		this.dados = dados;
	}

}
