package com.treinamento;

import com.treinamento.core.Pessoa;
import com.treinamento.core.PessoaFactory;
import com.treinamento.core.PessoaFactory.Tipo;

public class Cadastro {
	public static void main(String[] args) {
		Pessoa pessoa = PessoaFactory.getInstance(Tipo.ALUNO).getPessoa("Caio");
		System.out.println("Pessoa Cadastrada: " + pessoa.getNome());
	}
}
