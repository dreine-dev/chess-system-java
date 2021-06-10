package tabuleirojogo;

public class Tabuleiro {

	private int linhas;
	private int colunas;
	private Peca[][] pecas;

	public Tabuleiro(int linhas, int colunas) {
		if (linhas < 1 || colunas < 1) {
			throw new TabuleiroException(
					"Erro criando tabuleiro. É nexessário que haja pelo menos 1 linha e uma coluna");
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
			throw new TabuleiroException("Posição não exixte em tabuleiro");
		}
		return pecas[linha][coluna];
	}

	// METODO SOBRE CARGA - OVERLOAD
	public Peca peca(Posicao posicao) {
		if (!posicaoExiste(posicao)) {
			throw new TabuleiroException("Posição não exixte em tabuleiro");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}

	public void pecaLugar(Peca peca, Posicao posicao) {
		if (existeUmaPeca(posicao)) {
			throw new TabuleiroException("Já há uma peça neste posição " + posicao);
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

	public boolean existeUmaPeca(Posicao posicao) {
		if (!posicaoExiste(posicao)) {
			throw new TabuleiroException("Posição não exixte em tabuleiro");
		}
		return peca(posicao) != null;
	}

}
