package com.treinamento.core;

public abstract class Pessoa {
	
	protected String nome;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}

	abstract String toLiteral();

}
