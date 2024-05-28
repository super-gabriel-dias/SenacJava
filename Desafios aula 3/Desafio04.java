package aula03_desafio;

import java.util.Scanner;

public class Desafio04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);


		System.out.print("Insira quatro notas: ");

		int nota1 = input.nextInt();
		int nota2 = input.nextInt();
		int nota3 = input.nextInt();
		int nota4 = input.nextInt();

		int notatotal = nota1 + nota2 + nota3 + nota4;
		double notamedia = notatotal / 4;

		System.out.print("A média das notas foi: ");
		System.out.print(notamedia);
	}

}
