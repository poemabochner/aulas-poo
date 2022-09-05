package br.org.serratec.teste;

import br.org.serratec.model.Assistente;
import br.org.serratec.model.Gerente;

public class TesteFuncionario {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Roberto", "0123", 8000., "Financeiro");
		Assistente assistente = new Assistente("Poema", "1234", 20000., "Assistente TI");
		gerente.aumentarSalario();
		assistente.aumentarSalario();
		System.out.println("Dados: "+ gerente.getNome()+"\n"+gerente.getSalario());
		System.out.println("Dados: "+ assistente.getNome()+"\n"+assistente.getSalario());
		
	}

}
