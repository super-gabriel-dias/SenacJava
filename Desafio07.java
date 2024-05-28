package aula03_desafio;

import java.util.Scanner;

public class Desafio07 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Insira uma temperatura em fahrenheit para converter em Celsius: ");
		
		double fahrenheit = input.nextInt();
		
		double celsius = (fahrenheit - 32) / 1.8;
		
		System.out.print("\n\nCelsius: ");
		
		System.out.print(celsius);
	}

}
