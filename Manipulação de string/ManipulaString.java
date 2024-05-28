package kalil;

public class ManipulaString {

	public static void main(String[] args) {
		
		String tarefa = "";
		
		int horaDisponivel = 8;
		tarefa += cadastrarTarefa("001", "Estudar Java", 10, 11, horaDisponivel -= 11-10);
		tarefa += cadastrarTarefa("002", "Fazer compras", 11, 12, horaDisponivel -= 12-11);
		tarefa += cadastrarTarefa("003", "Limpar a casa", 12, 13, horaDisponivel -= 13-12);
		exibirTarefas(tarefa);
	}
	
	private static void exibirTarefas(String tarefa) {
		System.out.println("Tarefa - Codigo - Inicio - Fim\n\n");
		System.out.println(tarefa);
		
	}
	
	private static String cadastrarTarefa(String descricao, String codigo, int inicio, int fim, int hora ) {
		
		
		
		
		return String.format("%s - %s - %d - %d - Horas restantes: %d horas\n\n", codigo, descricao, inicio, fim, hora);
	}

}
