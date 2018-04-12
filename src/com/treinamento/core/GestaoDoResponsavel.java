package com.treinamento.core;

import java.util.List;

public class GestaoDoResponsavel extends Gestao  {

	private Responsavel responsavel;

	public GestaoDoResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}

	@Override
	public void exibir() {
		List<Pessoa> filhos = responsavel.getAluno();
		
		System.out.println("Nome do Responsavel: " + responsavel.getNome());
		
		for (Pessoa pessoa : filhos) {
			System.out.println("Nome do(s) filho(s): " + pessoa.getNome());
		}
	}

}
