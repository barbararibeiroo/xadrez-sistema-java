package xadrez.pecas;

import tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PartidaXadrez;
import xadrez.xadrezPeca;

public class KingRei extends xadrezPeca{
	public KingRei(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro,cor);
		}
	@Override
	public String toString() {
		return "K";
	}
}
