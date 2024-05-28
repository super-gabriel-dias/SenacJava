package kalil;

public class Dengue {

	public static void main(String[] args) {
		
		/*String dengue = "";
		
		dengue += verificarSintomas("Dor de cabeça");
		dengue += verificarSintomas("Febre");
		dengue += verificarSintomas("Dor atrás dos olhos");
		dengue += verificarSintomas("Dor nas articulações");
		
		System.out.println(dengue);
		
		diagnostico(dengue);*/
		
		diagnosticoNovo("Dor de cabeça", "Febre", "Dor atrás dos olhos", "Dor nas articulações");

		

	}
	
	private static void diagnosticoNovo (String sint1, String sint2, String sint3, String sint4){
		String sint1Esperado = "Dor de cabeça";
		String sint2Esperado = "Febre";
		String sint3Esperado = "Dor atrás dos olhos";
		String sint4Esperado = "Dor nas articulações";
		
		boolean diagnosticoFinal = sint1.equals(sint1Esperado)&&sint2.equals(sint2Esperado)&&sint3.equals(sint3Esperado)&&sint4.equals(sint4Esperado);
		
		System.out.println("A pessoa tem dengue? Resposta: " + diagnosticoFinal);
	}
	
	/*private static void diagnostico(String dengue) {
		boolean d1 = dengue.contains("Dor de cabeça");
		boolean d2 = dengue.contains("Febre");
		boolean d3 = dengue.contains("Dor nas articulações");
		boolean d4 = dengue.contains("Dor atrás dos olhos");
		
		boolean diagnosticoFinal = d1&&d2&&d3&&d4;
		
		System.out.println("A pessoa está com dengue\n\n " + diagnosticoFinal);

	}
	
	private static String verificarSintomas(String sintoma) {
		
		return String.format("%s\n", sintoma);
	}
*/
}
