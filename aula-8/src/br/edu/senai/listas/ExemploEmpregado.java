package br.edu.senai.listas;

import java.util.ArrayList;
import java.util.List;

import br.edu.senai.model.Empregado;

public class ExemploEmpregado {
	public static void main(String[] args) {
		List<Empregado> empregados = new ArrayList<>();
		
		empregados.add(new Empregado("Poema", "3402384"));
		empregados.add(new Empregado("João", "043409384"));
		empregados.add(new Empregado("Lana", "012209384"));
		
		for (Empregado empregado : empregados) {
			System.out.println(empregado);

		}
	}
} 
