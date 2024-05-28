package aula03_desafio;

import java.util.Scanner;

public class Desafio03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		
		System.out.print("");
		
		int num = input.nextInt();
		
		System.out.println(num);
		
		System.out.print("Digite outro número: ");
		
		int num2 = input.nextInt();
		
		System.out.println(num2);
		
		System.out.print("\nResultado da soma: ");
		
		System.out.println(num + num2);
	}

}
