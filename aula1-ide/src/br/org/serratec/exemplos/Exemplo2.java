package br.org.serratec.exemplos;

import java.time.LocalDate;
import java.util.List;

public class Exemplo2 {

	public static void main(String[] args) {
		// alt + shift + r - alterar nome de variáveis e métodos
		// ctrl + shift + f - indentação do programa
		int preco = 100;
		preco = 300;
		List Alunos;
		
		LocalDate data = LocalDate.now();
		System.out.println("Hoje é dia: "+ data);
		System.out.println(preco);
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
	}

}
