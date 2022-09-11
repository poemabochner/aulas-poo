package br.edu.senai.arquivos;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class LeituraBinaria {

	public static void main(String[] args) {

		try {
			//File file = new File()
			FileInputStream arquivo = new FileInputStream("/exemplos/teste.dat");
			DataInputStream lerArquivo = new DataInputStream(arquivo);
			String resultado = lerArquivo.readLine();
			System.out.println(resultado);
			lerArquivo.close();
		} catch (Exception e) {
			System.out.println("Arquivo não encontrado!");
			//e.printStackTrace();
		}
	}

}
