package br.edu.senai.listas;

import java.util.Arrays;
import java.util.List;

public class ExemploListaArrays {
	
	//uma lista com arrays as List não pode ser alterada na entrada de dados (elemento novo)
	
	public static void main(String[] args) {
	List<String> cores = Arrays.asList("Amarelo","Vermelho","Rosa");
	//cores.add("Branco");
	
	
	if (cores.isEmpty()) {
		System.out.println("A lista está vazia!");
	}else {
		System.out.println(cores);

	}
	
	System.out.println("A lista contém a cor Vermelho? " + (cores.contains("Vermelho")? "Sim":"Não"));
	}

}
