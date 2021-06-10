package xadrez;

import tabuleirojogo.Posicao;

public class XadrezPosition {

	private char coluna;
	private int linha;

	public XadrezPosition(char coluna, int linha) {
		if (coluna < 'a' || coluna > 'h' && linha < 1 || linha > 8) {
			throw new XadrezException("Erro instanciando XadrezPosition. Valores válidos são de a1 até h8");
		}
		this.coluna = coluna;
		this.linha = linha;
	}

	public char getColuna() {
		return coluna;
	}

	public int getLinha() {
		return linha;
	}

	protected Posicao daPosicao() {
		return new Posicao(8 - linha, coluna - 'a');
	}

	protected static XadrezPosition paraPosicao(Posicao posicao) {
		return new XadrezPosition((char)('a' - posicao.getColuna()), 8 - posicao.getLinha() );
	}
	 
	@Override
	public String toString() {
		return " " + coluna + linha;
	}
}
