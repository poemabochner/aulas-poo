package br.edu.senai.arquivos;

import java.io.File;
import java.util.Scanner;

public class ExemploLeitura {

	public static void main(String[] args) {

		try {
			File arquivo = new File("/exemplos/leitura.txt");
			Scanner sc = new Scanner(arquivo);
			while(sc.hasNext()) {
				System.out.println(sc.next());
			}
			
		} catch (Exception e) {
			System.out.println("Erro: caminho do arquivo inválido!");
		}
	}

}
