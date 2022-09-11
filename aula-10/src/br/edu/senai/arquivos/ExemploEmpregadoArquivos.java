package br.edu.senai.arquivos;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import br.edu.senai.model.Empregado;


public class ExemploEmpregadoArquivos {

	public static void main(String[] args) {

		File arquivo = new File("/exemplos/empregados.txt");
		try {
			Scanner sc = new Scanner(arquivo);
			Set<Empregado> empregados = new HashSet<>();
			System.out.println("-------Leitura de Arquivo-------");

			while (sc.hasNextLine()) {
				String linha = sc.nextLine();
				if (!linha.isEmpty()) {
					String vetor[] = linha.split(";");
					empregados.add(new Empregado(vetor[0], vetor[1]));
				}
			}
			sc.close();
			
			System.out.println("------Dados do arquivo--------\n");
			for (Empregado empregado : empregados) {
				System.out.println(empregado);
			}
			
		System.out.println("---Gravação de Arquivo---");
		FileWriter arquivoGravar = new FileWriter("/exemplos/empregados-gravar.txt");
		PrintWriter gravacaoArquivo = new PrintWriter(arquivoGravar);
		for (Empregado empregado : empregados) {
			String linha = empregado.getCpf()+";"+empregado.getNome();
			gravacaoArquivo.printf(linha);
		}
		
		System.out.println("Arquivo gravado com sucesso");
		gravacaoArquivo.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Não funcionou");
		}
	}

}
