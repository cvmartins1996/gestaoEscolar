package com.treinamento;

public class ClassificacaoFactory  {
	
	Classificacao getInstance(Aluno aluno) {
		float media = aluno.getGrade().getMedia();
		
		return classificacaoPonderada(media);
		
	}

	private Classificacao classificacaoPonderada(float media) {
		
		boolean muitoBom = media == 10;
		boolean bom = media > 8;
		boolean razoavel = media >  6;
		
		if (muitoBom) {
			return new MuitoBom();
		} else if (bom) {
			return new Bom();
		} else if (razoavel)  {
			return new Razoavel();
		} else {
			return new Insatisfatorio();
		}
		
	}
	
//	public enum Tipo_Classificacao {
//		
//		MUITO_BOM, BOM, RAZOAVEL, INSATISFATORIO;
//		
//		private boolean valor;
//		private static float media;
//		
//		static {
//			MUITO_BOM.valor = media == 10;
//			BOM.valor = media > 8 ;
//		}
//	}
	
}

