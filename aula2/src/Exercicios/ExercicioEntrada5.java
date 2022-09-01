package Exercicios;

import java.util.Scanner;

//5) Crie um programa que leia um número inteiro e imprima o seu antecessor e eu sucessor.
public class ExercicioEntrada5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("entre com um número inteiro: ");
		a=sc.nextInt();
		
		b=a+1;
		c=a-1;
		
		System.out.println("antecessor: " + c + "\nsucessor: " + b);
		
		sc.close();
	}

}
