package br.edu.senai.varargs;

public class ExemploVarArgs {

	public static void main(String[] args) {
		//String a = "qualquer coisa";
		//System.out.printf("%s %d", 9, "t");
		//varargs 
		System.out.println(	somarNumeros(10,20,30));
//estrutura dos pontinhos ... libera passar quantos valores a pessoa quiser
	}	
		
		public static int somarNumeros(int...numeros) {
			int soma = 0;
			for (int valor : numeros) {
				soma +=valor;
			}
		
		return soma;
		
		}	
	}


