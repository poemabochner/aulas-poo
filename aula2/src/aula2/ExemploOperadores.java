package aula2;

//idade superior a 18 ou altura maior igual a 1.80
public class ExemploOperadores {

	public static void main(String[] args) {
		int idade = 19;
		double altura = 1.65;
		
		if(idade > 18 || altura >= 1.80) {
			System.out.println("competirá");
		}else {
			System.out.println("não competirá");
		}
		//ternário
		String resposta = idade > 18 || altura >=1.80 ? "competirá":"não competirá";
		System.out.println(resposta);
	}

}
