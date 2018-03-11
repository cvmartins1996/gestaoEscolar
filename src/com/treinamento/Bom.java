package com.treinamento;

public class Bom extends Classificacao {
	
	public String classificacaoDoAluno() {
		if (getDesempenho() > 8) {
			return "B";
		}
		return "nda";
	}

	
}
