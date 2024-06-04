package aula03_desafio;

public class Bomba {

	private double quantidade;
	private double preco;
	private String tipoCombustivel;

	public Bomba(double quantidade, double preco, String tipoCombustivel) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.tipoCombustivel = tipoCombustivel;
	}

	public double valorParaLitros(double litros) {

		return litros * preco;
	}

	public boolean abastecerPorLitro(double litros) {
		if (litros <= 0 || litros > quantidade) {
			return false;
		}
		quantidade -= litros;
		return true;
	}

	public boolean abastecerPorValor(double valor) {
		double litrosAbastecidos = valor / preco;
		if (litrosAbastecidos > quantidade) {
			return false;
		}
		quantidade -= litrosAbastecidos;
		return true;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
}
