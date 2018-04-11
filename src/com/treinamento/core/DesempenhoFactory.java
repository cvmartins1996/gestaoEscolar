package com.treinamento.core;

public class DesempenhoFactory  {
	
	private Aluno aluno;
	
	public DesempenhoFactory(Aluno aluno){
		aluno = this.aluno;
	}
	
	
	public static DesempenhoFactory getInstance(Aluno aluno){
		return new DesempenhoFactory(aluno);
	}
	
	void exibir() {
	}
	
}
