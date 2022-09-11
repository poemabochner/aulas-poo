package br.edu.senai.teste;

import br.edu.senai.model.Empregado;

public class TesteEmpregado {

	public static void main(String[] args) {
		
		Empregado empregado1 = new Empregado("123", "Ronaldo");
		Empregado empregado2 = new Empregado("321", "Paulo");
		
		System.out.println(empregado1);
		System.out.println(empregado2);
		
		if(empregado1.equals(empregado2)) {
			System.out.println("Iguais!");
		} else {
			System.out.println("Diferentes");
		}
	}

}
