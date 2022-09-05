package br.org.serratec.teste;

import br.org.serratec.model.AtletaAmador;

public class TesteMaratonista {

	public static void main(String[] args) {
		AtletaAmador atleta1 = new AtletaAmador("João", "M", 12, 1.50, true);
	
		if(atleta1.verificaSituação()) {
		System.out.println(atleta1 + "\nPode Competir!");
		}else {
			System.out.println(atleta1 + "\nNão pode competir!");
		}
		
		
	}

}
