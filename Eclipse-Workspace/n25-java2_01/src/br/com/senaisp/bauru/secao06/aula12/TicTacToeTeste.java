package br.com.senaisp.bauru.secao06.aula12;

import java.util.Scanner;

public class TicTacToeTeste {

	public static void main(String[] args) {
		TicTacToe tc = new TicTacToe();
		Scanner sc = new Scanner(System.in);
		tc.IniciarTabuleiro();
		//Pedindo o nome do player 
		System.out.println("Digite seu nome: ");
		tc.setNomePlayer(sc.nextLine());
		//----------------------
		do {
		tc.mostrarTabuleiro();
		System.out.println("Digite a casa desejada (1-9): ");
		int casa = sc.nextInt();
		tc.lancarJogada(casa-1);
		
	}while(!tc.ehFimJogo());
	tc.mostrarTabuleiro();
	System.out.println("O vencedor foi" + tc.getVencedor());
	sc.close();
}
}
