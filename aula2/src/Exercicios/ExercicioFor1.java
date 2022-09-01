package Exercicios;

import java.util.Iterator;

//Faça um programa que percorra números entre 0 e 30 e exiba a 
//quantidade de números pares e impares.

public class ExercicioFor1 {
	public static void main(String[] args) {
		int CPar = 0, CImpar = 0;
		
		for(int i=0; i<30; i++) {
			if (i%2==0) {
				CPar +=1;
			}else {
				CImpar += 1;
			}
		}
		System.out.println("A quantidade de números pares entre 0 e 30 é: "+ CPar);
		System.out.println("A quantidade de números ímpares entre 0 e 30 é: "+ CImpar);
	}
}
