package br.org.serratec.test;

import br.serratec.org.model.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setCodigo(1);
		pessoa1.setNome("Ricardo");
		
		pessoa1.setPeso(55.5);
		pessoa1.setAltura(1.62);
		
		System.out.println("Sua situação é: " + pessoa1.c);//pra funcionar preciso terminar de fazer os ifs do resultadoIMC no Pessoa
	}

}
