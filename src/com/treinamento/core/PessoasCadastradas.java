package com.treinamento.core;


public class PessoasCadastradas extends Gestao {

	Pessoa pessoa;
	
	public PessoasCadastradas(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public void mostrar() {
		System.out.println("Nome da pessoa cadastrada: " + pessoa.getNome());
	}

	@Override
	public void exibir() {
		mostrar();
	}


}
