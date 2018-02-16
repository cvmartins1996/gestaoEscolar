package com.treinamento;

import java.util.ArrayList;
import java.util.List;

public class Responsavel extends Pessoa {

	private List<Pessoa> alunos = new ArrayList<>();

	public Responsavel(String nome) {
		super(nome);
	}

	public void adicionarFilho(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public List<Pessoa> getAluno() {
		return alunos;
	}

}
