package com.treinamento;

public class Aluno {

	private Grade grade;
	private String nome;

	public Aluno(String nome) {
		this.nome = nome;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	
	public Grade getGrade() {
		return grade;
	}
	
	public String getNome() {
		return nome;
	}

}
