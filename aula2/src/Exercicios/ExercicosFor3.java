package Exercicios;

import java.util.Iterator;

//3) Faça uma tabela de multiplicação para o número 2 multiplicando do 1 até 10.

public class ExercicosFor3 {

	public static void main(String[] args) {
		
		int numero =2;
		int resultado = 0;
		
		for(int i=1; i<=10; i++) {
			resultado = numero*i;
			System.out.println(numero+" x "+i+" = "+ resultado );
		}
		
	}
}
