package com.treinamento.core;

public class ClassificacaoFactory  {
	
	private float media;

	public ClassificacaoFactory(Aluno aluno) {
		media = aluno.getGrade().getMedia();
	}

	public static ClassificacaoFactory getInstance(Aluno aluno) {
		return new ClassificacaoFactory(aluno);
	}

	public Classificacao getClassificacao() {
		
		boolean muitoBom = media == 10;
		boolean bom = media > 8;
		boolean razoavel = media >  6;
		
		if (muitoBom) {
			return new MuitoBom();
		} else if (bom) {
			return new Bom();
		} else if (razoavel)  {
			return new Razoavel();
		} else {
			return new Insatisfatorio();
		}
		
	}
	
}