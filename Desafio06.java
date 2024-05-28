package aula03_desafio;

import java.util.Scanner;

public class Desafio06 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Quanto você ganha por hora? (utilize o ponto invés da vírgula) R$");
		
		double salariohora = input.nextInt();
		
		System.out.print("\n\nE quantas horas trabalha no mês? " );
		
		double horapormes = input.nextInt();
		
		double salariototal = salariohora * horapormes;
		
		System.out.print("\n\nSeu salário no mês é: R$");
		
		System.out.print(salariototal);

	}

}
