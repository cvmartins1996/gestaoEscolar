package com.treinamento;

public class App {
	public static void main(String[] args) {
		//Pessoa aluno = new Aluno("Creuza");
		Aluno aluno = new Aluno("Creuza");
		
		Responsavel responsavel = new Responsavel("Jusué");
		
		responsavel.setFilho(aluno);
		
		
		Materia cienciasSociais = new Materia("Ciencias Sociais");
		cienciasSociais.adicionarNotas(new Nota(8.5f));
		cienciasSociais.adicionarNotas(new Nota(10f));
		
		Materia filosofia = new Materia("Filosofia");
		filosofia.adicionarNotas(new Nota(10f));
		filosofia.adicionarNotas(new Nota(10f));
		
		
		Grade grade = new Grade();
		grade.adicionarMaterias(cienciasSociais);
		grade.adicionarMaterias(filosofia);
		aluno.setGrade(grade);
		
		Desempenho desempenho = new Desempenho();
		desempenho.exibir(aluno);
		
		PessoasCadastradas pessoasCadastradas = new PessoasCadastradas();
		pessoasCadastradas.mostrar(aluno);
		pessoasCadastradas.mostrar(responsavel);
		
	}
}

