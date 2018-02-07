package com.treinamento;

import java.util.List;

public class Desempenho {

	public void exibir(Aluno aluno) {
		mediaPorMateria(aluno);
		System.out.println("\n M�dia geral: " + aluno.getGrade().getMedia());
		
		
	}

	private void mediaPorMateria(Aluno aluno) {
		List<Materia> materias = aluno.getGrade().getMaterias();
		for (Materia materia : materias) {
			System.out.println("Exibir m�dia por materia" + "\n" + "Materia: " + materia.getNome() + " M�dia: " + materia.getMedia());
		}
	}

	public void mostrarCadastro(Paternidade paternidade) {
		List<Aluno> alunos = paternidade.getAluno();
		for (Aluno aluno : alunos) {
			System.out.println("Nome do Aluno: " + aluno.getNome() + " Paternidade associada ao aluno: " + paternidade.getNome());
		}
	}

}
