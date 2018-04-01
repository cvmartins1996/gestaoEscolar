package com.treinamento;

public class ClassificacaoFactory  {
	
	Classificacao getInstance(Aluno aluno) {
		if (aluno.getGrade().getMedia() > 8) {
			return new Bom();
		}
		return new Insatisfatorio();
	}
	
}
