package br.edu.senai.teste;

import br.edu.senai.model.Empregado;

public class VetorEmpregado {

	public static void main(String[] args) {
		//Empregado empregado = new Empregado("Poema", "3402384");
		//Empregado empregado2 = new Empregado("João", "043409384");
		
		Empregado[] empregados = new Empregado[3];
		
		empregados[0]= new Empregado("Poema", "3402384");
		empregados[1]= new Empregado("João", "043409384");
		empregados[2]= new Empregado("Lana", "012209384");
		
		for (Empregado empregado : empregados) {
			System.out.println(empregado);
		}
	}

}
