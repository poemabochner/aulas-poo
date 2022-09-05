package br.org.serratec.teste;

import br.org.serratec.model.Assistente;
import br.org.serratec.model.Diretor;
import br.org.serratec.model.Gerente;

public class TesteEmpregado {

	public static void main(String[] args) {
		
		Assistente a = new Assistente("123", "Poema", 20000.0, 100.0);
		Gerente g = new Gerente("234", "Ana", 4000.0, "Financeiro");
		Diretor d = new Diretor("345", "Carolina", 7000.0, "CIO");
		
		a.aumentarSalario();
		g.aumentarSalario();
		d.aumentarSalario();
		
		System.out.println(a);
		System.out.println(g);
		System.out.println(d);
	}

}
