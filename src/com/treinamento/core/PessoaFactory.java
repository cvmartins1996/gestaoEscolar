package com.treinamento.core;

public class PessoaFactory {
	
	private Tipo tipo;
	
	public enum Tipo{
		ALUNO, RESPONSAVEL
	}
	

	public PessoaFactory(Tipo tipo) {
		this.tipo = tipo;
	}

	public static PessoaFactory getInstance(Tipo tipo) {
		return new PessoaFactory(tipo);
	}

	public Pessoa getPessoa(String nome) {
		
		if (tipo == Tipo.ALUNO) {
			return new Aluno(nome);
		} else if (tipo == Tipo.RESPONSAVEL) {
			return new Responsavel(nome);
		}
		
		return null;
	}
}
