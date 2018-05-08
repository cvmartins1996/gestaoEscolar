package com.treinamento.core;

import java.util.List;

public class GestaoDoResponsavel  {

	public void exibir(Responsavel responsavel) {
		List<Pessoa> filhos = responsavel.getAluno();
		
		System.out.println("Nome do Responsavel: " + responsavel.getNome());
		
		for (Pessoa aluno : filhos) {
			System.out.println("Nome do(s) filho(s): " + aluno.getNome());
		}
	}

}
