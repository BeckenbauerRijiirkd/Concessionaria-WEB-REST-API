package br.web.domain.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Carro {
	
	
	@Id @GeneratedValue
	private Long id;
	private String nome;
	private String marca;
	private String ano;
	
public Carro() {
		
	}
	
	public Carro(String nome, String ano, String marca, Long id) {
		this.id = id;
		this.nome = nome;
		this.ano = ano;
		this.marca = marca;
		
	}	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	
	
	
	
	
}
