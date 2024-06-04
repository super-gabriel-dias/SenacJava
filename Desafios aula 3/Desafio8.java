package aula03_desafio;

import java.util.Scanner;

public class Desafio8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite o primeiro número inteiro: ");
		int primeiroNumero = input.nextInt();

		System.out.print("Digite o segundo número inteiro: ");
		int segundoNumero = input.nextInt();

		System.out.print("Digite o número real: ");
		double numeroReal = input.nextDouble();

		double produto = (2 * primeiroNumero) * (segundoNumero / 2.0);

		double soma = (3 * primeiroNumero) + numeroReal;

		double cubo = numeroReal * numeroReal * numeroReal;

		System.out.println("\nResultados:");
		System.out.println("a) Produto do dobro do primeiro com metade do segundo: " + produto);
		System.out.println("b) Soma do triplo do primeiro com o terceiro: " + soma);
		System.out.println("c) Terceiro elevado ao cubo: " + cubo);
	}

}
