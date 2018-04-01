package com.treinamento;

import java.util.List;

public abstract class ClassificacaoFactory  {

	abstract Classificacao getClassificacao();
	
	Classificacao toAppend(List<Aluno> alunos) {
		for (Aluno aluno : alunos) {
			if (aluno.getGrade().getMedia() > 8) {
				return new Bom();
			}
		}
		return null;
	}
	
}
