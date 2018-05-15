package com.treinamento;

import com.treinamento.core.Grade;
import com.treinamento.core.Materia;

public class CadastroDeGrade {
	public static void main(String[] args) {
		Materia cienciasSociais = new Materia("Ciencias Sociais");
		cienciasSociais.adicionarNota(5f);
		cienciasSociais.adicionarNota(4f);
		
		Materia filosofia = new Materia("Filosofia");
		filosofia.adicionarNota(7f);
		filosofia.adicionarNota(10f);
		
		Grade grade = new Grade();
		grade.adicionarMateria(cienciasSociais);
		grade.adicionarMateria(filosofia);
		
	}
}
