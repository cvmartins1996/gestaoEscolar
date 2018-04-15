package com.treinamento.core;

import java.util.List;

public class Desempenho{
	
	public void exibir(Aluno aluno) {
		System.out.println("Nome do Aluno: " + aluno.toLiteral());
		mediaPorMateria(aluno);
		mediaGeral(aluno);
		System.out.println("Classifica��o do aluno: " + aluno.getClassificacao().getClassificacao());
	}
	
	private void mediaGeral(Aluno aluno) {
		System.out.println("\nM�dia geral: " + aluno.getGrade().getMedia());
	}

	private void mediaPorMateria(Aluno aluno) {
		
		List<Materia> materias = aluno.getGrade().getMaterias();
		
		System.out.println("Exibi��o Por Materia");
		
		for (Materia materia : materias) {
			System.out.println("\n" + "Materia: " + materia.getNome() + " M�dia: " + materia.getMedia() );
		}
	}
}
