package xadrez;


import tabuleirojogo.Posicao;
import tabuleirojogo.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;


public class PartidaDeXadrez{

	private Tabuleiro tabuleiro;
	
	
	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		configuracaoInicial();
	}

	public PecaDeXadrez[][] getPecaDeXadrez() {
		PecaDeXadrez[][] mat = new PecaDeXadrez[tabuleiro.getLinha()][tabuleiro.getColuna()];
		for (int i = 0; i < tabuleiro.getLinha(); i++) {
			for (int j = 0; j < tabuleiro.getColuna(); j++) {
				mat[i][j] = (PecaDeXadrez)tabuleiro.peca(i, j);
			}
		}
		return mat;
	}



	
	
	
	private void configuracaoInicial() {
		tabuleiro.pecaLugar(new Torre(tabuleiro, Cor.BRANCA), new Posicao(2,1));
		tabuleiro.pecaLugar(new Rei(tabuleiro, Cor.PRETA), new Posicao(0,4));
		tabuleiro.pecaLugar(new Rei(tabuleiro, Cor.BRANCA), new Posicao(7,4));
	}
}
