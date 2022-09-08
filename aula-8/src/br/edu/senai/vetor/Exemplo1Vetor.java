package br.edu.senai.vetor;

public class Exemplo1Vetor {

	public static void main(String[] args) {
		String[] vetor = new String[3];
			vetor[0]="Poema";
			System.out.println(vetor[0]);
		
			//String[]meses = new String[] {"Janeiro", "Fevereiro", "Março"}; ---> outra forma de declarar
			
			String[]meses = {"Janeiro", "Fevereiro", "Março", "Abril"};
			
			for (String mes : meses) {
				System.out.println(mes);
			}
	}

}
