package br.org.serratec.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.org.serratec.model.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Ana", "a@gmail.com", 54);
		Pessoa p2 = new Pessoa("Pedro", "p@gmail.com", 30);
		Pessoa p3 = new Pessoa("João", "j@gmail.com", 45);
		
		List<Pessoa>pessoas = new ArrayList<>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		
		Collections.sort(pessoas);
		System.out.println(pessoas);
	}

}
