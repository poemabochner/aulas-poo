package br.edu.senai.teste;

import br.edu.senai.enums.MarcaTV;
import br.edu.senai.model.TV;

public class TesteTV {

	public static void main(String[] args) {
		TV tv = new TV("SN/2343", 42., MarcaTV.SONY);
		System.out.println(tv.toString());
	}

}
