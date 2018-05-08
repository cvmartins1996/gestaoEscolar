package com.treinamento.core;

public class PessoaFactory {
	
	private static final int RESPONSAVEL = 2;
	private static final int ALUNO = 1;
	private String nome;
	private int tipo;

	public PessoaFactory(String nome, int tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}

	public static PessoaFactory getInstance(String nome, int tipo) {
		return new PessoaFactory(nome, tipo);
	}

	public Pessoa getPessoa() {
		
		if (tipo == ALUNO) {
			Aluno aluno = new Aluno(nome);
			
			new Pessoa(nome);
			return aluno;
		} else if (tipo == RESPONSAVEL) {
			Responsavel responsavel = new Responsavel(nome);
			
			return responsavel;
		}
		
		return null;
	}
}
