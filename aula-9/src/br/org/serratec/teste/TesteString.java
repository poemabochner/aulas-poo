package br.org.serratec.teste;

public class TesteString {

	public static void main(String[] args) {
		String texto = "teste";

		try {
			texto = texto.toUpperCase();
			System.out.println(texto);

		} catch (NullPointerException e) { //é importante indicar a classe correta do erro, nesse caso é erro de null pointer
			System.out.println("Valor nulo na String");
		}

	}

}
