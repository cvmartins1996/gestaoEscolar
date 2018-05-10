package com.treinamento;

import com.treinamento.core.Aluno;
import com.treinamento.core.Classificacao;
import com.treinamento.core.ClassificacaoFactory;
import com.treinamento.core.Desempenho;
import com.treinamento.core.GestaoDoResponsavel;
import com.treinamento.core.Grade;
import com.treinamento.core.Materia;
import com.treinamento.core.PessoasCadastradas;
import com.treinamento.core.Responsavel;

public class App {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("Caio");
		Responsavel responsavel = new Responsavel("Martins");
		
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
		
		Classificacao classificacao = ClassificacaoFactory.getInstance(aluno).getClassificacao();
		
		aluno.setClassificacao(classificacao);
		
		new Desempenho().exibir(aluno);
		new GestaoDoResponsavel().exibir(responsavel);
		new PessoasCadastradas().mostrar(aluno);
		new PessoasCadastradas().mostrar(responsavel);
	}
}
