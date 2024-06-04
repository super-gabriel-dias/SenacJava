package aula03_desafio;


import java.util.Scanner;

public class Desafio9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua altura em metros: ");
        double altura = input.nextDouble();

        System.out.print("Digite seu sexo (M/F): ");
        String sexo = input.next().toUpperCase();

        double pesoIdeal = 0;
        if (sexo.equals("M")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo.equals("F")) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido. Digite M ou F.");
        }

        if (pesoIdeal > 0) {
            System.out.println("\nSeu peso ideal é: " + pesoIdeal + " kg");
        }
    }
}
