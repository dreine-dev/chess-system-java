package tabuleirojogo;

import xadrez.PecaDeXadrez;

public class Tabuleiro {

	private int linhas;
	private int colunas;
	private Peca[][] pecas;

	public Tabuleiro(int linha, int coluna) {
		this.linhas = linha;
		this.colunas = coluna;
		pecas = new Peca[linha][coluna];
	}

	public int getLinha() {
		return linhas;
	}

	public void setLinha(int linha) {
		this.linhas = linha;
	}

	public int getColuna() {
		return colunas;
	}

	public void setColuna(int coluna) {
		this.colunas = coluna;
	}

	public Peca peca(int linha, int coluna) {
		return pecas[linha][coluna];
	}

	// METODO SOBRE CARGA - OVERLOAD
	public Peca peca(Posicao posicao) {
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}

	public void pecaLugar(Peca peca, Posicao posicao) {
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
}
