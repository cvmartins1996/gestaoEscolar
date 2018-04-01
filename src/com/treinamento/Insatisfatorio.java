package com.treinamento;

public class Insatisfatorio extends Classificacao {

	public Insatisfatorio() {
		System.out.println("Insatisfatorio");
	}
	
	@Override
	public Classificacao getClassificacao() {
		return new Insatisfatorio();
	}

}
