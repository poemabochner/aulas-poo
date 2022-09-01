package Exercicios;

public class ExercicioFor2 {
//2) Faça um programa que percorra todos os número de 1 até 22.
//Para os números múltiplos de 2, imprima a palavra
//“Java”, e mostre o total de múltiplos de 2 encontrado.
	
	public static void main(String[] args) {
		int multiplos = 0;
		
		for (int i = 1; i<=22; i++) {
			if (i%2==0) {
				System.out.println("Java");
				multiplos += 1;
			}
			
		}
		System.out.println("O total de múltiplos de 2 é: "+ multiplos);
	}

}
