package br.edu.senai.teste;

import br.edu.senai.enums.EstadoCivil;
import br.edu.senai.model.Pessoa;
import br.edu.senai.model.Setor;

public class TestePessoa {

	public static void main(String[] args) {
		Setor s = new Setor(4, "RH");
		//Setor s2 = new Setor(6, "DP");
		
		Pessoa p = new Pessoa("Pedro", "30492340", EstadoCivil.CASADO, s);
		//Pessoa p2 = new Pessoa()
		
		System.out.println(p.toString()+s.toString());
		
			for (EstadoCivil situacao : EstadoCivil.values()) {
				System.out.println(situacao);
			}
	}
	
}
