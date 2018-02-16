package com.treinamento;

import java.util.ArrayList;
import java.util.List;

public class Materia {

	private List<Nota> notas = new ArrayList<>();
	private String nome;
	
	private MuitoBom muitoBom = new MuitoBom();
	private Bom bom = new Bom();
	private Razoavel razoavel = new Razoavel();
	private Insatisfatorio insatisfatorio = new Insatisfatorio();
	
	public Materia(String nome) {
		this.nome = nome;
	}

	public void adicionarNota(Nota nota) {
		notas.add(nota);
	}
	
	public float getMedia() {
		return somatoriaMedia();
	}

	public String getClassificacao() {
		if ( getMedia() > 9f ) {
			return muitoBom.getNome();
		} else if ( getMedia() > 7.5f ) {
			return bom.getNome();
		} else if ( getMedia() > 6f ) {
			return razoavel.getNome();
		} else {
			return insatisfatorio.getNome();
		}
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
