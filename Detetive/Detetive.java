package kalil;

import java.util.Scanner;

public class Detetive {

	public static void main(String[] args) {

		int ponto = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Telefonou para a vítima? ");

		System.out.print("");

		String pergunta1 = input.next();

		if (pergunta1.contains("sim") ) {
			ponto++;
		}

		System.out.print("Esteve no local do crime? ");

		System.out.print("");

		String pergunta2 = input.next();

		if (pergunta2.contains("sim")) {
			ponto++;
		}

		System.out.print("Mora perto da vítima? ");

		System.out.print("");

		String pergunta3 = input.next();

		if (pergunta3.contains("sim")) {
			ponto++;
		}

		System.out.print("Devia para a vítima? ");

		System.out.print("");

		String pergunta4 = input.next();

		if (pergunta4.contains("sim")) {
			ponto++;
		}

		System.out.print("Já trabalhou com a vítima? ");

		System.out.print("");

		String pergunta5 = input.next();

		if (pergunta5.contains("sim")) {
			ponto++;
		}
		
		if (ponto == 2) {
			System.out.println("O usuário é meio suspeito...");
		}
		else {
				if (ponto == 3 || ponto == 4) {
					System.out.println("O usuário é cúmplice.");
				}else {
					if(ponto >= 5) {
						System.out.println("O usuário é o assassino.");
					}else {
						System.out.println("O usuário é inocente.");
					}
				}
			}
		
		System.out.println("\nPontuação: " + ponto);
		}

	}


