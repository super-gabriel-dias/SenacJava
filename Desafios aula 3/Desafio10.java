package aula03_desafio;

import java.util.Scanner;

public class Desafio10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor por hora trabalhada: R$ ");
        double valorHora = input.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = input.nextInt();

        double salarioBruto = valorHora * horasTrabalhadas;

        double descontoINSS = salarioBruto * 0.08;

        double descontoSindicato = salarioBruto * 0.05;

        double descontoIR = salarioBruto * 0.11;

        double salarioLiquido = salarioBruto - descontoINSS - descontoSindicato - descontoIR;

        System.out.println("\nResultados:");
        System.out.printf("a) Salário Bruto: R$ %.2f\n", salarioBruto);
        System.out.printf("b) Desconto INSS: R$ %.2f\n", descontoINSS);
        System.out.printf("c) Desconto Sindicato: R$ %.2f\n", descontoSindicato);
        System.out.printf("d) Desconto Imposto de Renda: R$ %.2f\n", descontoIR);
        System.out.printf("e) Salário Líquido: R$ %.2f\n", salarioLiquido);
    }
}
