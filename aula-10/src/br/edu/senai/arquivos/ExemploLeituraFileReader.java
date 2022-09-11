package br.edu.senai.arquivos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ExemploLeituraFileReader {
	public static void main(String[] args) {
		try {
			//FileReader fr = new FileReader("/exemplos/leitura.txt");
			Scanner sc = new Scanner(new FileReader("/exemplos/leitura.txt"));
			while (sc.hasNext()) {
				String line = sc.nextLine();
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado !");
		}

	}
}
