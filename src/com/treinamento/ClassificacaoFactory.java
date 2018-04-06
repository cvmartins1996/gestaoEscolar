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
	
}



interface Pagamento{
	
	void validar();
	
}

class PagamentoCartao implements Pagamento{

	@Override
	public void validar() {
		System.out.println("Ta cavando a cova!");
		
	}
	
}

class PagamentoBoleto implements Pagamento{

	@Override
	public void validar() {
		throw new IllegalArgumentException("Tu é pobre!");
		
	}
	
}


class Client{
	public static void main(String[] args) {
		int tipo = 1;
		
		Pagamento pagamento;
		
//		if(tipo == 1){
//			pagamento = new PagamentoBoleto();
//		}else {
//			pagamento = new PagamentoCartao();
//		}
		
//		pagamento.validar();
		
		
	}
	
	class PagamentoFactory{
		Pagamento getPagamento(){
			return new Pagamento();
		}
		
		
	}
}