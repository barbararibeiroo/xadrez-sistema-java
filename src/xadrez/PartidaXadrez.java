package xadrez;

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
	private void colocaNovaPeca(char coluna, int linha, xadrezPeca peca ) {
		tabuleiro.colocarPeca(peca, new XadrezPosicao(coluna, linha).toPosicao());
	}
	
	private void inicialSetup() {
		colocaNovaPeca('b', 6,new RookTorre(tabuleiro, Cor.BRANCO));
		colocaNovaPeca('e', 8,new KingRei(tabuleiro, Cor.PRETO));
		colocaNovaPeca('e', 1,new KingRei(tabuleiro, Cor.BRANCO));
	}

}