package br.edu.senai.set;

import java.util.HashSet;
import java.util.Set;
//import java.util.TreeSet;
// Igual a lista porém não aceita elementos duplicados
public class ExemploSet {

	public static void main(String[] args) {
	Set <String> cores =	new HashSet<>();
	// Set<String> cores = new TreeSet<>(); igual ao anterior, porém ordena em ordem alfabética
		cores.add("Vermelho");
		cores.add("Vermelho");
		cores.add("Vermelho");
		cores.add("Rosa");
		
		System.out.println(cores);

		
	}

}
