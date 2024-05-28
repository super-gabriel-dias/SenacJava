package kalil;

public class Formulario01_Java {

	public static void main(String[] args) {
		boolean opcao = false;
		int numero = 1;
		String texto = "1";
		var resultado = opcao && !opcao;
		numero = numero + 2;
		resultado = (numero >= 2) || resultado;
		numero = 1;
		resultado = (numero == Integer.parseInt(texto)) && resultado;

		System.out.println(resultado);
	}

}
