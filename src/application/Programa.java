package application;

import java.util.Scanner;

import xadrez.PartidaXadrez;
import xadrez.XadrezPosicao;
import xadrez.xadrezPeca;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PartidaXadrez partidaxadrez = new PartidaXadrez();

		while (true) {
			UI.printTabuleiro(partidaxadrez.getPeca());
			System.out.println();
			System.out.println("Origem: ");
			XadrezPosicao origem = UI.LerPosicao(sc);

			System.out.println();
			System.out.println("Destino: ");
			XadrezPosicao destino = UI.LerPosicao(sc);
			
			xadrezPeca capturaPeca = partidaxadrez.perfomXadrezMover(origem, destino);
		}

	}
}
