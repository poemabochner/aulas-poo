package aula2;

public class ExemploRepeticao2 {

	public static void main(String[] args) {
		String[]vetor = {"Ana", "Maria", "Carla"};
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		System.out.println("------------");
		
		for (String nome : vetor) {
			System.out.println(nome);
		}
	}

}
