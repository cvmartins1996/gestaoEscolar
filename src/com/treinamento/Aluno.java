package com.treinamento;

public class Aluno extends Cadastro {



	private Grade grade;

	public Aluno(String nome) {
		super(nome);
	}
	
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	
	public Grade getGrade() {
		return grade;
	}
	

}
