package br.edu.senai.teste;

import br.edu.senai.model.Imovel;
import br.edu.senai.model.Pessoa;

public class TesteImovel {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Layla", "llll@gmail.com");
		Pessoa pessoa2 = new Pessoa("Maria", "maria@gmail.com");
		
		Imovel imovel1 = new Imovel("Casa", "Centro", 6493792., pessoa2);
		
		System.out.println(imovel1.getLocal()+" - "+ imovel1.getPessoa().getNome());
	}

}
