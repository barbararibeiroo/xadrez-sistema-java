package xadrez;

import tabuleiro.Tabuleiro;

public class PartidaXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
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

}