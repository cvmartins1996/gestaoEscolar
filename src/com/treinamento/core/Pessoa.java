package com.treinamento.core;

public abstract class Pessoa {
	private String nome;

	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

}
