package com.treinamento.core;

import java.util.ArrayList;
import java.util.List;

public class Materia {

	private List<Nota> notas = new ArrayList<>();
	private String nome;
	
	public Materia(String nome) {
		this.nome = nome;
	}

	public void adicionarNota(float valor) {
		notas.add(new Nota(valor));
	}

	public float getMedia() {
		return somatoriaMedia();
	}
	
	private float somatoriaMedia() {
		float somatoria = 0;
		for (Nota nota : notas) {
			somatoria = somatoria + nota.getValor();
		}
		return (somatoria/notas.size());
	}
	
	public String getNome() {
		return nome;
	}

}
