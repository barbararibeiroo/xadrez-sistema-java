package xadrez.pecas;

import tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.xadrezPeca;

public class RookTorre extends xadrezPeca {

	public RookTorre(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	
	}

	@Override
	public String toString() {
		return "R";
	}
	
	
}
