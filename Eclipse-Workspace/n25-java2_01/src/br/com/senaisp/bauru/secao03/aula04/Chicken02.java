package br.com.senaisp.bauru.secao03.aula04;

public class Chicken02 {

	public static void main(String[] args) {

		double dailyAverage = 0, monthlyAverage = 0, monthlyProfit = 0;
		int totalEggs = 0;
		
		//1º Dia
		totalEggs = 100;
		
		//2º Dia
		totalEggs +=121;
		
		//3º Dia
		totalEggs += 117;
		
		//Fazendo as contas
		
		dailyAverage = totalEggs/3.0;
		monthlyAverage = dailyAverage * 30;
		monthlyProfit = monthlyAverage * 0.18;
		
		System.out.println("daily Average "+dailyAverage);
		System.out.println("monthly Average "+monthlyAverage);
		System.out.println("monthly Profit "+monthlyProfit);

	}

}
