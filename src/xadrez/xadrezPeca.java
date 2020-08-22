package xadrez;

import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public class xadrezPeca extends Peca {
		private Cor cor;  
		
	public xadrezPeca(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

}
