package Exercicios;
//2) Faça um programa para ler os dados de 4 pessoas contendo nome, peso e altura.

//Calcule e escreva:
//O nome da pessoa com maior peso
//O nome da pessoa com maior altura
//A média de peso
//A média de altura

import java.util.Scanner;

public class ExercicioEntrada2 {
	public static void main(String[] args) {

		String nome1, nome2, nome3, nome4; // %s
		double peso1, peso2, peso3, peso4; // %f
		double altura1, altura2, altura3, altura4;

		Scanner sc = new Scanner(System.in);

		System.out.println("digite um nome: ");
		nome1 = sc.next();

		System.out.println("digite o peso: ");
		peso1 = sc.nextDouble();

		System.out.println("digite a altura: ");
		altura1 = sc.nextDouble();

		System.out.println("digite um nome: ");
		nome2 = sc.next();

		System.out.println("digite o peso: ");
		peso2 = sc.nextDouble();

		System.out.println("digite a altura: ");
		altura2 = sc.nextDouble();

		System.out.println("digite um nome: ");
		nome3 = sc.next();

		System.out.println("digite o peso: ");
		peso3 = sc.nextDouble();

		System.out.println("digite a altura: ");
		altura3 = sc.nextDouble();

		System.out.println("digite um nome: ");
		nome4 = sc.next();

		System.out.println("digite o peso: ");
		peso4 = sc.nextDouble();

		System.out.println("digite a altura: ");
		altura4 = sc.nextDouble();

		System.out.println("\n\n\n\n\n\n\n\n\n\n");

		// O nome da pessoa com maior peso
		if (peso1 > peso2 && peso1 > peso3 && peso1 > peso4) {
			System.out.printf("%s tem o maior peso.", nome1);
		} else if (peso2 > peso1 && peso2 > peso3 && peso2 > peso4) {
			System.out.printf("%s tem o maior peso.", nome2);
		} else if (peso3 > peso2 && peso3 > peso1 && peso3 > peso4) {
			System.out.printf("%s tem o maior peso.", nome3);
		} else {
			System.out.printf("%s tem o maior peso.", nome4);
		}
		//O nome da pessoa com maior altura
	}

}
