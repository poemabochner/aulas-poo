package br.org.serratec.test;

import java.util.Scanner;

import br.serratec.org.model.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setCodigo(1);
		pessoa1.setNome("Ricardo");
		pessoa1.setPeso(55.5);
		pessoa1.setAltura(1.62);
		
		new Pessoa();
		Pessoa pessoa2 = new Pessoa(2, "maria", 80., 1.75); 
		
		//System.out.println("Sua situação é: " + pessoa1.resultadoIMC());//pra funcionar preciso terminar de fazer os ifs do resultadoIMC no Pessoa
		//System.out.println("Sua situação é: " + pessoa2.resultadoIMC());
	
		for(int i = 0; i <= 1; i++) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Digite o código: ");
			Integer codigo = sc.nextInt();
			
			System.out.println("Digite o nome: ");
			String nome = sc.next();
			
			System.out.println("Digite o peso: ");
			Double peso = sc.nextDouble();
			
			System.out.println("Digite o altura: ");
			Double altura = sc.nextDouble();
			
			Pessoa pessoa = new Pessoa(codigo, nome, peso, altura);
			System.out.println("O resultado é: "+pessoa.resultadoIMC());
			
		}
	}

}
