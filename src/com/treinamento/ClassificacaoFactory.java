package com.treinamento;

import java.util.List;

public class ClassificacaoFactory  {
	
	Classificacao getInstance(List<Aluno> alunos) {
		for (Aluno aluno : alunos) {
			if (aluno.getGrade().getMedia() > 8) {
				return new Bom();
			}
			
		}
		
		return new Insatisfatorio();
	}
	
}
