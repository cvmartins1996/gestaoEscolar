package com.treinamento.core;

public class ClassificacaoFactory  {
	
	private float media;

	public ClassificacaoFactory(Aluno aluno) {
		media = aluno.getGrade().getMedia();
	}

	public static ClassificacaoFactory getInstance(Aluno aluno) {
		return new ClassificacaoFactory(aluno);
	}

	public Classificacao getClassificacao() {
		
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
	

	private static final int PAGAMENTO_EM_BOLETO = 0;
	private static final int PAGAMENTO_EM_CARTAO = 1;

	public static void main(String[] args) {
		int tipo = PAGAMENTO_EM_CARTAO;
		
		Pagamento pagamento =  new PagamentoFactory().getInstance(tipo);
		
		pagamento.validar();
		
		tipo = PAGAMENTO_EM_BOLETO;
		Pagamento pagamento2 =  new PagamentoFactory().getInstance(tipo);
		
		pagamento2.validar();
		
	}
	
}

class PagamentoFactory{
	private static final int PAGAMENTO_EM_BOLETO = 0;
	
	

	Pagamento getInstance(int tipo) {
		switch (tipo) {
		case PAGAMENTO_EM_BOLETO:
			return new PagamentoBoleto();
		default:
			return new PagamentoCartao();
		}
	}
	
}

