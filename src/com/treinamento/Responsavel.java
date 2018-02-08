package com.treinamento;

import java.util.ArrayList;
import java.util.List;

public class Responsavel extends Pessoa {

	private List<Aluno> alunos = new ArrayList<>();

	public Responsavel(String nome) {
		super(nome);
	}

	public void setFilho(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public List<Aluno> getAluno() {
		return alunos;
	}

}
