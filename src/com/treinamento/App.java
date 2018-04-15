package com.treinamento;

import com.treinamento.core.Aluno;
import com.treinamento.core.ClassificacaoFactory;
import com.treinamento.core.Desempenho;
import com.treinamento.core.GestaoDoResponsavel;
import com.treinamento.core.Grade;
import com.treinamento.core.Materia;
import com.treinamento.core.Pessoa;
import com.treinamento.core.PessoaFactory;
import com.treinamento.core.PessoasCadastradas;
import com.treinamento.core.Responsavel;

public class App {

	private static final int ALUNO = 1;

	public static void main(String[] args) {
		
		Aluno aluno2 = new Aluno("Izelda");
		
		Responsavel responsavel = new Responsavel("Jusué");
		
		Pessoa pessoa = PessoaFactory.getInstance("Caio", ALUNO).getPessoa();
		
		Aluno aluno = new Aluno(pessoa.getNome());
		
		responsavel.adicionarFilho(aluno);
		responsavel.adicionarFilho(aluno2);
		
		Materia cienciasSociais = new Materia("Ciencias Sociais");
		cienciasSociais.adicionarNota(5f);
		cienciasSociais.adicionarNota(4f);
		
		Materia filosofia = new Materia("Filosofia");
		filosofia.adicionarNota(7f);
		filosofia.adicionarNota(10f);
		
		Grade grade = new Grade();
		grade.adicionarMateria(cienciasSociais);
		grade.adicionarMateria(filosofia);
		
		aluno.setGrade(grade);
		
		aluno.setClassificacao(ClassificacaoFactory.getInstance(aluno).getClassificacao());
		
		new Desempenho().exibir(aluno);
		new GestaoDoResponsavel().exibir(responsavel);
		new PessoasCadastradas().mostrar(aluno);
	}
}
