package com.treinamento;

public class Bom extends Classificacao {
	
	public Bom() {
		System.out.println("Bom");
	}

	@Override
	public Classificacao getClassificacao() {
		return new Bom();
	}

}
