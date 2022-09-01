package teste;

import java.util.Scanner;

public class Teste2Leitura {

	public static void main(String[] args) {
		String nome; //%s
		int idade; // %d
		double altura; //%f
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite um nome: ");
		nome = sc.next();
		
		System.out.println("digite a idade: ");
		idade = sc.nextInt();
		
		System.out.println("digite a altura: ");
		altura = sc.nextDouble();
		
		System.out.printf("%s tem %d anos e %.2f de altura", nome, idade, altura);
	}

}
