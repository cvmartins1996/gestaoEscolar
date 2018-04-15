package com.treinamento.core;

public class PessoaFactory {
	
	private String nome;
	private int tipo;

	public PessoaFactory(String nome, int tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}

	public static PessoaFactory getInstance(String pessoa, int tipo) {
		return new PessoaFactory(pessoa, tipo);
	}

	public Pessoa getPessoa() {
		if (tipo == 1) {
			return new Aluno(nome);
			
		}
		return new Responsavel(nome);
	}
}
