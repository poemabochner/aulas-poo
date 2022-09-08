package br.org.serratec.exemplo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExemploArquivo {

	public static void main(String[] args) {
		int a = 10, b = 0;
		int vetor[] = { 100, 200, 300 };
		try {
			FileReader fr = new FileReader("/Documentos/kkkkkk");
			System.out.println("Arquivo encontrado");
			System.out.println(a / b);
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
			// e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("Erro! Divisão por zero");
		}
	}

}
