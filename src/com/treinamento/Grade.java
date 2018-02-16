package com.treinamento;

import java.util.ArrayList;
import java.util.List;

public class Grade {

	private List<Materia> materias = new ArrayList<>();
	
	public void adicionarMateria(Materia materia) {
		materias.add(materia);
	}
	
	public float getMedia() {
		return somatoriaDaMedia();
	}

	private float somatoriaDaMedia() {
		float media = 0;
		for (Materia materia : materias) {
			media =  media + materia.getMedia();
		}
		return (media/materias.size());
	}

	public List<Materia> getMaterias() {
		return materias;
	}
	

}
