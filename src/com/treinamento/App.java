package com.treinamento;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Creuza");
		Aluno aluno2 = new Aluno("Izelda");
		List<Aluno> alunos = new ArrayList<>();
		
		Responsavel responsavel = responsavel(aluno, aluno2);
		
		Materia cienciasSociais = materiaDoAluno2();
		
		Materia filosofia = materiaDoAluno();
		
		Grade grade = grade(aluno, cienciasSociais, filosofia);
		
		alunos.add(aluno);
		Classificacao classificacao = new ClassificacaoFactory().getInstance(alunos);
		
		Desempenho desempenho = new Desempenho();
		desempenho.exibir(aluno);
		
		PessoasCadastradas pessoasCadastradas = new PessoasCadastradas();
		pessoasCadastradas.mostrar(aluno);
		pessoasCadastradas.mostrar(responsavel);
		
		GestaoDoResponsavel gestao = new GestaoDoResponsavel();
		gestao.exibir(responsavel);
		
		
	}

	private static Responsavel responsavel(Aluno aluno, Aluno aluno2) {
		Responsavel responsavel = new Responsavel("Jusué");
		responsavel.adicionarFilho(aluno);
		responsavel.adicionarFilho(aluno2);
		return responsavel;
	}

	private static Materia materiaDoAluno2() {
		Materia cienciasSociais = new Materia("Ciencias Sociais");
		cienciasSociais.adicionarNota(new Nota(5f));
		cienciasSociais.adicionarNota(new Nota(4f));
		return cienciasSociais;
	}

	private static Materia materiaDoAluno() {
		Materia filosofia = new Materia("Filosofia");
		filosofia.adicionarNota(new Nota(7f));
		filosofia.adicionarNota(new Nota(10f));
		return filosofia;
	}

	private static Grade grade(Aluno aluno, Materia cienciasSociais, Materia filosofia) {
		Grade grade = new Grade();
		grade.adicionarMateria(cienciasSociais);
		grade.adicionarMateria(filosofia);
		aluno.setGrade(grade);
		return grade;
	}
}
