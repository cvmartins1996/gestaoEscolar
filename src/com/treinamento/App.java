package com.treinamento;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Creuza");
		Aluno aluno2 = new Aluno("Izelda");
		List<Aluno> alunos = new ArrayList<>();
		
		Responsavel responsavel = new Responsavel("Jusué");
		responsavel.adicionarFilho(aluno);
		responsavel.adicionarFilho(aluno2);
		
		Materia cienciasSociais = new Materia("Ciencias Sociais");
		cienciasSociais.adicionarNota(new Nota(5f));
		cienciasSociais.adicionarNota(new Nota(4f));
		
		Materia filosofia = new Materia("Filosofia");
		filosofia.adicionarNota(new Nota(7f));
		filosofia.adicionarNota(new Nota(10f));
		
		Grade grade = new Grade();
		grade.adicionarMateria(cienciasSociais);
		grade.adicionarMateria(filosofia);
		aluno.setGrade(grade);
		
		alunos.add(aluno);
		Classificacao classificacao = new ClassificacaoFactory().getInstance(alunos);
		
		aluno.setClassificacao(classificacao);
		
		Desempenho desempenho = new Desempenho();
		desempenho.exibir(aluno);
		
		PessoasCadastradas pessoasCadastradas = new PessoasCadastradas();
		pessoasCadastradas.mostrar(aluno);
		pessoasCadastradas.mostrar(responsavel);
		
		GestaoDoResponsavel gestao = new GestaoDoResponsavel();
		gestao.exibir(responsavel);
		
		
	}
}
