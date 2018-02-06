package com.treinamento;

public class App {
	public static void main(String[] args) {
		Desempenho desempenho = new Desempenho();
		Aluno creuza = new Aluno("Creuza");
		Materia cienciasSociais = new Materia("Ciencias Sociais");
		cienciasSociais.adicionarNotas(new Nota(8.5f));
		cienciasSociais.adicionarNotas(new Nota(10f));
		Materia filosofia = new Materia("Filosofia");
		filosofia.adicionarNotas(new Nota(10f));
		filosofia.adicionarNotas(new Nota(10f));
		Grade grade = new Grade();
		grade.adicionarMaterias(cienciasSociais);
		grade.adicionarMaterias(filosofia);
		creuza.setGrade(grade);
		desempenho.exibir(creuza);
		
	}
}
