package com.treinamento;

import com.treinamento.core.Aluno;
import com.treinamento.core.ClassificacaoFactory;
import com.treinamento.core.DesempenhoFactory;
import com.treinamento.core.Grade;
import com.treinamento.core.Materia;
import com.treinamento.core.Responsavel;

public class App {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Creuza");
		Aluno aluno2 = new Aluno("Izelda");
		
		Responsavel responsavel = new Responsavel("Jusué");
		responsavel.adicionarFilho(aluno);
		responsavel.adicionarFilho(aluno2);
		
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
		
		DesempenhoFactory.getInstanceForAluno(aluno);
		DesempenhoFactory.getInstanceForPessoa(aluno);
		DesempenhoFactory.getInstanceForPessoa(responsavel);
		DesempenhoFactory.getInstanceForResponsavel(responsavel);
		
	}
}
