package xadrez;

import tabuleiro.Peca;
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
		for(int i=0; i < tabuleiro.getLinhas(); i++) {
			for(int j=0; j < tabuleiro.getColunas(); j++) {
				mat[i][j] = (xadrezPeca) tabuleiro.peca(i, j);
			}
		}
	return mat;
	}
	public xadrezPeca perfomXadrezMover(XadrezPosicao origemPosicao, XadrezPosicao destinoPosicao) {
		Posicao origem = origemPosicao.toPosicao();
		Posicao destino = destinoPosicao.toPosicao();
		validateSourcePosicao(origem);
		Peca capturaPeca = fazerMover(origem, destino);
		return (xadrezPeca)capturaPeca;
	}
	
	private Peca fazerMover (Posicao origem, Posicao destino) {
		Peca p = tabuleiro.removePeca(origem);
		Peca capturaPeca = tabuleiro.removePeca(destino);
		tabuleiro.colocarPeca(p, destino);
		return capturaPeca;
	}
	private void validateSourcePosicao(Posicao posicao) {
		if (!tabuleiro.PecaExiste(posicao)) {
			throw new XadrezException("NÃO EXISTE PEÇA NA POSIÇÃO DE ORIGEM");
		}
	}
	
	private void colocaNovaPeca(char coluna, int linha, xadrezPeca peca ) {
		tabuleiro.colocarPeca(peca, new XadrezPosicao(coluna, linha).toPosicao());
	}
	
	private void inicialSetup()  {
		colocaNovaPeca('c', 1, new RookTorre(tabuleiro, Cor.BRANCO));
		colocaNovaPeca('c', 2, new RookTorre(tabuleiro, Cor.BRANCO));
		colocaNovaPeca('d', 2, new RookTorre(tabuleiro, Cor.BRANCO));
		colocaNovaPeca('e', 2, new RookTorre(tabuleiro, Cor.BRANCO));
		colocaNovaPeca('e', 1, new RookTorre(tabuleiro, Cor.BRANCO));
		colocaNovaPeca('d', 1, new KingRei(tabuleiro, Cor.BRANCO));

		colocaNovaPeca('c', 7, new RookTorre(tabuleiro, Cor.PRETO));
		colocaNovaPeca('c', 8, new RookTorre(tabuleiro, Cor.PRETO));
		colocaNovaPeca('d', 7, new RookTorre(tabuleiro, Cor.PRETO));
		colocaNovaPeca('e', 7, new RookTorre(tabuleiro, Cor.PRETO));
		colocaNovaPeca('e', 8, new RookTorre(tabuleiro, Cor.PRETO));
		colocaNovaPeca('d', 8, new KingRei(tabuleiro, Cor.PRETO));
	}
}
