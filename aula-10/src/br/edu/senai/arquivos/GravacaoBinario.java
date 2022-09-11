package br.edu.senai.arquivos;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class GravacaoBinario {

	public static void main(String[] args) {
		try {
			FileOutputStream gravar = new FileOutputStream("/exemplos/teste.dat");
			DataOutputStream gravarArquivo = new DataOutputStream(gravar);
			gravarArquivo.writeChars("Java Orientação a Objetos");
			gravarArquivo.close();

		} catch (Exception e) {
			System.out.println("Erro na gravação do arquivo!");
		}
	}

}
