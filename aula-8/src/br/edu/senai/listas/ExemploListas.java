package br.edu.senai.listas;

import java.util.ArrayList;
import java.util.List;

public class ExemploListas {

	public static void main(String[] args) {
		List listaDeTimes = new ArrayList<>();
		
		listaDeTimes.add("Vasco");
		listaDeTimes.add("Manchester United");
		listaDeTimes.add("Bayern");
		
		System.out.println("Tamanho: " +listaDeTimes.size());
		//listaDeTimes.remove(2);
		//listaDeTimes.set(1, "Dinamo Moscow"); (alteração)
		System.out.println(listaDeTimes);
	}

}
