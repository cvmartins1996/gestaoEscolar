package com.treinamento;

public class ClassificacaoFactory  {
	
	Classificacao getInstance(Aluno aluno) {
		float media = aluno.getGrade().getMedia();
		
		System.out.println("media" +  media);
		if (media == 10) {
			return new MuitoBom();
		} else if (media > 8) {
			return new Bom();
		} else if (media >  6)  {
			return new Razoavel();
		} else {
			return new Insatisfatorio();
		}
	}
	
}

