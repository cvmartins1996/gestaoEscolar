package com.treinamento;

import com.treinamento.core.PessoaFactory;
import com.treinamento.core.PessoasCadastradas;

public class App {

	private static final int ALUNO = 1;
	private static final int RESPONSAVEL = 2;

	public static void main(String[] args) {
		
		
		
		String pessoa = PessoaFactory.getInstance("Caio", ALUNO).getPessoa();
		String responsavel = PessoaFactory.getInstance("Martins", RESPONSAVEL).getPessoa();
		
		
		new PessoasCadastradas().mostrar(pessoa);
		new PessoasCadastradas().mostrar(responsavel);
	}
}
