package br.org.serratec.teste;

import br.org.serratec.exception.ContaException;
import br.org.serratec.model.Poupanca;

public class TesteConta {

	public static void main(String[] args) {
		Poupanca poupanca = new Poupanca("Joaquim", 1000.);
		try {
			poupanca.deposito(100.);
			poupanca.saque(2000.);
		} catch (ContaException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
