package com.treinamento;

import com.treinamento.core.Aluno;
import com.treinamento.core.GestaoDoResponsavel;
import com.treinamento.core.PessoaFactory;
import com.treinamento.core.PessoasCadastradas;
import com.treinamento.core.Responsavel;

public class App {

	private static final int ALUNO = 1;

	public static void main(String[] args) {
		
		Aluno aluno2 = new Aluno("Izelda");
		
		Responsavel responsavel = new Responsavel("Jusué");
		
		PessoaFactory.getInstance("Caio", ALUNO).getPessoa();
		Aluno aluno = new Aluno("qualquer");
		
		responsavel.adicionarFilho(aluno);
		responsavel.adicionarFilho(aluno2);
		
		
		new GestaoDoResponsavel().exibir(responsavel);
		new PessoasCadastradas().mostrar(aluno);
	}
}
