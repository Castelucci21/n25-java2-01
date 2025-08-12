package br.com.senaisp.bauru.secao04.aula09;

import java.util.Scanner;

public class OrdemTexto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(OrdemTexto.class.getResourceAsStream("palavra.txt"));
		String maiorTexto, menorTexto;
		//setando maior menos com o primeiro texto
		maiorTexto = sc.nextLine();
		menorTexto = maiorTexto;
		while (sc.hasNextLine()) {
			String apoio = sc.nextLine();
			if (apoio.compareTo(menorTexto)<0);{
				menorTexto="" + apoio;
			}
			if (apoio.compareTo(maiorTexto)>0);{
				maiorTexto="" + apoio;
			}
		} System.out.println("Maior texto foi " + maiorTexto);
		  System.out.println("Menor texto foi " + menorTexto);
		  sc.close();
	}

}
