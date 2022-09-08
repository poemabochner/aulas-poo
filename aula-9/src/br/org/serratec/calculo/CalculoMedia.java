package br.org.serratec.calculo;

public class CalculoMedia {
	
	//public static int calcular (int num1, int num2) {
		//if(num2==0) {
			//throw: primeiro comando de tratamento de erro - lançar uma exception.
			//throw new ArithmeticException("Você digitou zero no segundo parâmetro!");
		//}
		//return num1 / num2;
	//}
	
	
	//throws / usado sempre com um par try catch
	public static int calcular(int num1, int num2) 
		throws Exception {
		return num1 / num2;
	}
}
