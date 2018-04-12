package com.treinamento.core;

public class DesempenhoFactory  {
	
	public static void getInstanceForAluno(Aluno aluno){
		new DesempenhoFactory().getAluno(aluno);
	}
	
	public static void getInstanceForResponsavel(Responsavel responsavel){
		new DesempenhoFactory().getResponsavel(responsavel);
	}
	
	public static void getInstanceForPessoa(Pessoa pessoa){
		new DesempenhoFactory().getPessoa(pessoa);
	}
	
	private void getPessoa(Pessoa pessoa) {
		new PessoasCadastradas(pessoa).exibir();
	}

	private void getResponsavel(Responsavel responsavel) {
		new GestaoDoResponsavel(responsavel).exibir();
	}
	
	private void getAluno(Aluno aluno) {
		new Desempenho(aluno).exibir();
	}

}
