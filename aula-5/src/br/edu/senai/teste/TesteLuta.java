package br.edu.senai.teste;

import br.edu.senai.model.Categoria;
import br.edu.senai.model.Luta;
import br.edu.senai.model.Lutador;

public class TesteLuta {

	public static void main(String[] args) {
		Categoria categoria1 = new Categoria("peso pesado");
		Categoria categoria2 = new Categoria("peso médio");
		
		Lutador lutador1 = new Lutador("Leticia", 92., 43, categoria1);
		Lutador lutador2 = new Lutador("Carolina", 90., 40, categoria1);
		
		Luta luta = new Luta(lutador1, lutador2, false);
		
		System.out.println(luta.confirmacaoLuta() ? "Confirmada":"Não confirmada");
	}

}
