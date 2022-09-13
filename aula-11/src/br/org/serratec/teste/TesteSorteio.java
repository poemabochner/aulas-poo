package br.org.serratec.teste;

import br.org.serratec.model.Funcionario;
import br.org.serratec.model.Sorteio;


public class TesteSorteio {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Ana", "a@gmail.com", 5400.);
		Funcionario f2 = new Funcionario("Pedro", "p@gmail.com", 3000.);
		Funcionario f3 = new Funcionario("João", "j@gmail.com", 4500.);
		Funcionario f4 = new Funcionario("Lucas", "l@gmail.com", 5000.);

		//Sorteio<Funcionario> sorteio = new Sorteio<>();
		//sorteio.adicionar(f1);
		//sorteio.adicionar(f2);
		//sorteio.adicionar(f3);
		//sorteio.adicionar(f4);
		
		//System.out.println("Quem ganhou o sorteio foi: "+sorteio.sorteio());
		
		Sorteio<String> sorteio = new Sorteio<>();
		String t1 = "Vasco" ;
		String t2 = "Flamengo";
		String t3 = "Botafogo";
		
		sorteio.adicionar(t1);
		sorteio.adicionar(t2);
		sorteio.adicionar(t3);
		System.out.println("Quem ganhou o sorteio foi: "+sorteio.sorteio());

		
		
		
	}

}
