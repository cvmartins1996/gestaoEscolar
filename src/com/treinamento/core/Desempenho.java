package com.treinamento.core;

import java.util.List;

public class Desempenho  extends Gestao {
	
	private Aluno aluno;

	public Desempenho(Aluno aluno) {
		this.aluno = aluno;
	}

	@Override
	public void exibir() {
		System.out.println("Nome do Aluno: " + aluno.getNome());
		mediaPorMateria(aluno);
		mediaGeral(aluno);
		System.out.println("Classificação do aluno: " + aluno.getClassificacao().getClassificacao());
	}
	
	private void mediaGeral(Aluno aluno) {
		System.out.println("\n Média geral: " + aluno.getGrade().getMedia());
	}

	private void mediaPorMateria(Aluno aluno) {
		
		List<Materia> materias = aluno.getGrade().getMaterias();
		
		System.out.println(" Exibição Por Materia ");
		
		for (Materia materia : materias) {
			System.out.println("\n" + "Materia: " + materia.getNome() + " Média: " + materia.getMedia() );
		}
	}
}
