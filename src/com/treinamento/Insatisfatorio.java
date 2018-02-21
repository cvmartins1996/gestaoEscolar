package com.treinamento;

public class Insatisfatorio extends Classificacao {

	private String nome = "I";
	
	public Insatisfatorio(String nome) {
		super(nome);
	}

	public String setNome(String nome) {
		return this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
}
