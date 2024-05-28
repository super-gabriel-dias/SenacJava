package aula03_desafio;

import java.util.Scanner;

public class Desafio05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		
		System.out.print("Insira um número de metros: ");
		double metros = input.nextInt();
		double centimetros = metros * 100;
		System.out.print("\nConversão para centímetros: ");
		System.out.print(centimetros);
	}

}
