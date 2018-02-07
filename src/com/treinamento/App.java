package com.treinamento;

public class App {
	public static void main(String[] args) {
		Aluno creuza = new Aluno("Creuza");
		
		Aluno denilsa = new Aluno("Denilsâ");
		
		Paternidade jusue = new Paternidade("Jusué");
		Paternidade neldina = new Paternidade("Neldina");
		
		jusue.setFilho(creuza);
		jusue.setFilho(denilsa);
		
		neldina.setFilho(denilsa);
		neldina.setFilho(creuza);
		
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
		denilsa.setGrade(grade);
		
		Desempenho desempenho = new Desempenho();
		desempenho.exibir(creuza);
		desempenho.mostrarCadastro(jusue);
		desempenho.mostrarCadastro(neldina);
	}
}

