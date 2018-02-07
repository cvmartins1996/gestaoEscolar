package com.treinamento;

import java.util.ArrayList;
import java.util.List;

public class Paternidade extends Cadastro {

	private List<Aluno> alunos = new ArrayList<>();

	public Paternidade(String nome) {
		super(nome);
	}

	public void setFilho(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public List<Aluno> getAluno() {
		return alunos;
	}

}
