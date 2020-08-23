package tabuleiro;

public class Tabuleiro {
	private int linhas;
	private int colunas;
	private Peca[][] pecas;

	public Tabuleiro(int linhas, int colunas) {
		if (linhas < 1 || colunas < 1) {
			throw new TabuleiroException("ERRO CRIANDO O TABULEIRO: DEVE HAVER PELO MENOS UMA LINHA E COLUNA");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];

	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public Peca peca(int linha, int coluna) {
		if (!posicaoExiste(linha, coluna)) {
			throw new TabuleiroException("POSIÇÃO NÃO EXISTE NO TABULEIRO!");

		}
		return pecas[linha][coluna];
	}

	public Peca peca(Posicao posicao) {
		if (!posicaoExiste(posicao)) {
			throw new TabuleiroException("POSIÇÃO NÃO EXISTE NO TABULEIRO!");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}

	public void colocarPeca(Peca peca, Posicao posicao) {
		if(PecaExiste(posicao)) {
			throw new TabuleiroException("POSIÇÃO OCUPADA PELA PEÇA: " + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}

	private boolean posicaoExiste(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}

	public boolean posicaoExiste(Posicao posicao) {
		return posicaoExiste(posicao.getLinha(), posicao.getColuna());
	}

	public boolean PecaExiste(Posicao posicao) {
		if(!posicaoExiste(posicao)) {
			throw new TabuleiroException("POSIÇÃO NÃO EXISTE NO TABULEIRO!");
		}
		
		return peca(posicao) != null;
	}

}
