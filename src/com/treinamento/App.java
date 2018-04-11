package com.treinamento;

import com.treinamento.core.Aluno;
import com.treinamento.core.Classificacao;
import com.treinamento.core.ClassificacaoFactory;
import com.treinamento.core.Desempenho;
import com.treinamento.core.GestaoDoResponsavel;
import com.treinamento.core.Grade;
import com.treinamento.core.Materia;
import com.treinamento.core.Nota;
import com.treinamento.core.PessoasCadastradas;
import com.treinamento.core.Responsavel;

public class App {

	public static void main(String[] args) {
		
		
		
		Aluno aluno = new Aluno("Creuza");
		Aluno aluno2 = new Aluno("Izelda");
		
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
		
		Classificacao classificacao = ClassificacaoFactory.getInstance(aluno).getClassificacao();
		
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
