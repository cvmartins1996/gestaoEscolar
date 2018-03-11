package com.treinamento;


public class Classificacao {

	protected float media;
	
	public float qualificarDesempenho(Grade grade) {
		media = grade.getMedia();
		return media;
	}
	
	public float getDesempenho() {
		return media;
	}
	
}