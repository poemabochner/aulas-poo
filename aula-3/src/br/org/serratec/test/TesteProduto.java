package br.org.serratec.test;

import java.util.Scanner;

import br.serratec.org.model.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i <3; i++) {
			System.out.println("Digite o código: ");
			Integer codigo = sc.nextInt();
			
			System.out.println("Digite o descrição: ");
			String descricao = sc.next();
			
			System.out.println("Digite o valor: ");
			Double valor = sc.nextDouble();
			
			Produto produto = new Produto(codigo, descricao, valor);
			System.out.println("Total geral de Produtos cadastrados: "+Produto.getTotalProdutos());
		}
			
	}

}
