package com.treinamento.core;

public class PessoaFactory {
	
	private static final int RESPONSAVEL = 2;
	private static final int ALUNO = 1;
	private String nome;
	private int tipo;

	public PessoaFactory(String nome, int tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}

	public static PessoaFactory getInstance(String nome, int tipo) {
		return new PessoaFactory(nome, tipo);
	}

	public String getPessoa() {
		
		if (tipo == ALUNO) {
			Aluno aluno = new Aluno(nome);
			
			Materia cienciasSociais = new Materia("Ciencias Sociais");
			cienciasSociais.adicionarNota(5f);
			cienciasSociais.adicionarNota(4f);
			
			Materia filosofia = new Materia("Filosofia");
			filosofia.adicionarNota(7f);
			filosofia.adicionarNota(10f);
			
			Grade grade = new Grade();
			grade.adicionarMateria(cienciasSociais);
			grade.adicionarMateria(filosofia);
			
			aluno.setGrade(grade);
			
			aluno.setClassificacao(ClassificacaoFactory.getInstance(aluno).getClassificacao());
			new Desempenho().exibir(aluno);
			return aluno.toLiteral();
		} else if (tipo == RESPONSAVEL) {
			Responsavel responsavel = new Responsavel(nome);
			new GestaoDoResponsavel().exibir(responsavel);
			return responsavel.toLiteral();
		}
		
		return null;
	}
}
