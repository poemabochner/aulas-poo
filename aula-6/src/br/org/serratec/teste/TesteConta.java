package br.org.serratec.teste;

import br.org.serratec.model.ContaCorrente;

public class TesteConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente("Roberto", 14500.);
		
		cc.deposito(1000.);
		cc.saque(500.);
		
		System.out.println(cc.toString());
	}

}
