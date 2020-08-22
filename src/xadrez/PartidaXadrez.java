package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pecas.KingRei;
import xadrez.pecas.RookTorre;

public class PartidaXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		inicialSetup();
	}
	public xadrezPeca[][] getPeca(){
		xadrezPeca[][] mat = new xadrezPeca[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i=0; i<tabuleiro.getLinhas(); i++) {
			for(int j=0; j<tabuleiro.getColunas(); j++) {
				mat[i][j] = (xadrezPeca) tabuleiro.peca(i, j);
			}
		}
	return mat;
	}
	private void inicialSetup() {
		tabuleiro.colocarPeca(new RookTorre(tabuleiro, Cor.BRANCO), new Posicao(2, 1));
		tabuleiro.colocarPeca(new KingRei(tabuleiro, Cor.PRETO), new Posicao(0, 4));
		tabuleiro.colocarPeca(new KingRei(tabuleiro, Cor.BRANCO), new Posicao(7, 4));
	}

}