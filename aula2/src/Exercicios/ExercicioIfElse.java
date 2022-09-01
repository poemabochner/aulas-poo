package Exercicios;

//Faça um programa com duas variáveis inteiras inicializadas com um valor, 
//compare e imprima na tela o maior valor.

public class ExercicioIfElse {

	public static void main(String[] args) {
		
		int a = 5, b = 3;
		
		if (a>b) {
			System.out.println("O maior valor é: "+a);
		} else {
			System.out.println("O maior valor é: b"+ b);
		}
		
		//ternário
		
		String resultado = a>b ?  "O maior valor é: "+ a: "O maior valor é: " + b;
		System.out.println(resultado);

	}

}
