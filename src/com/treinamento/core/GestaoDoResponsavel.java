package com.treinamento.core;

import java.util.List;

public class GestaoDoResponsavel  {

	public void exibir(Responsavel responsavel) {
		List<Pessoa> filhos = responsavel.getAluno();
		
		System.out.println("Nome do Responsavel: " + responsavel.toLiteral());
		
		for (Pessoa pessoa : filhos) {
			System.out.println("Nome do(s) filho(s): " + pessoa.toLiteral());
		}
	}

}
