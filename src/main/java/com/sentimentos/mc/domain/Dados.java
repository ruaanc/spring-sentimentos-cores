package com.sentimentos.mc.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dados implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column
	private Integer idade;
	@Column
	private String sexo;
	@Column
	private String corPreferida;
	@Column
	private List<String> sentimentosVermelho = new ArrayList<>();
	@Column
	private List<String> sentimentosVerde = new ArrayList<>();
	@Column
	private List<String> sentimentosAzul = new ArrayList<>();
	
	public Dados() {
	}
	
	public Dados(Integer id, Integer idade, String sexo, String corPreferida) {
		this.idade = idade;
		this.sexo = sexo;
		this.corPreferida = corPreferida;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCorPreferida() {
		return corPreferida;
	}

	public void setCorPreferida(String corPreferida) {
		this.corPreferida = corPreferida;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<String> getSentimentosVermelho() {
		return sentimentosVermelho;
	}

	public void setSentimentosVermelho(List<String> sentimentosVermelho) {
		this.sentimentosVermelho = sentimentosVermelho;
	}

	public List<String> getSentimentosVerde() {
		return sentimentosVerde;
	}

	public void setSentimentosVerde(List<String> sentimentosVerde) {
		this.sentimentosVerde = sentimentosVerde;
	}

	public List<String> getSentimentosAzul() {
		return sentimentosAzul;
	}

	public void setSentimentosAzul(List<String> sentimentosAzul) {
		this.sentimentosAzul = sentimentosAzul;
	}

}
