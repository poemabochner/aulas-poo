package br.edu.senai.teste;

import br.edu.senai.model.Cidade;
import br.edu.senai.model.Contato;
import br.edu.senai.model.Endereco;
import br.edu.senai.model.Estado;
import br.edu.senai.model.Telefone;

public class TesteTelefone {

	public static void main(String[] args) {
		Estado estado1 = new Estado("Rio de Janeiro", "RJ");
		Cidade cidade1 = new Cidade("Teresópolis", estado1);
		Endereco endereco1 = new Endereco("aaaa", "bbbbb", "cccc", cidade1);
		Contato contato1 = new Contato("Poema", endereco1);
		Telefone telefone1 = new Telefone("3048234820");
		
		System.out.println(estado1);
	}

}
