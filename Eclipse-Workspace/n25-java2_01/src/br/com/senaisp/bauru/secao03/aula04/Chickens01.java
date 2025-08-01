package br.com.senaisp.bauru.secao03.aula04;

public class Chickens01 {

	public static void main(String[] args) {
		
		int totalEggs = 0;
		int eggsPerChicken = 5; 
		int chickenCount = 3;
		
		//1° dia
		
		totalEggs += eggsPerChicken * chickenCount;
		
		//2º dia
		
		chickenCount++;
		
		//3º dia
		
		chickenCount/=2;
		
		totalEggs += eggsPerChicken * chickenCount;
		
		System.out.println(totalEggs);
	
	}

}
