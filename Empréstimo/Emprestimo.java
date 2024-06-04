package kalil;

import java.util.Scanner;

public class Emprestimo {

    private double valorEmprestimo;
    private int numeroParcelas;
    private double taxaJurosMensal;

    public Emprestimo(double valorEmprestimo, int numeroParcelas) {
        this.valorEmprestimo = valorEmprestimo;
        this.numeroParcelas = numeroParcelas;
        this.taxaJurosMensal = 0.02; // 2% ao mês
    }

    public double calcularValorParcela() {
        double valorJurosTotal = 0;
        for (int parcela = 1; parcela <= numeroParcelas; parcela++) {
            double jurosParcela = valorEmprestimo * Math.pow((1 + taxaJurosMensal), parcela - 1) * taxaJurosMensal;
            valorJurosTotal += jurosParcela;
        }

        return (valorEmprestimo + valorJurosTotal) / numeroParcelas;
    }

    public void mostrarResultado() {
        System.out.printf("Valor da parcela: R$ %.2f\n", calcularValorParcela());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do empréstimo: R$ ");
        double valorEmprestimo = input.nextDouble();

        System.out.print("Digite o número de parcelas: ");
        int numeroParcelas = input.nextInt();

        Emprestimo emprestimo = new Emprestimo(valorEmprestimo, numeroParcelas);
        emprestimo.mostrarResultado();
    }
}
