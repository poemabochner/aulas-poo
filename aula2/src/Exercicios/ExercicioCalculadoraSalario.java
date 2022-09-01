package Exercicios;
//2) Crie uma classe com o nome CalculadoraSalario defina uma variável com o nome, 
//salário, inicialize a variável com algum valor e
//exiba no console o valor do salário com desconto do INSS.

public class ExercicioCalculadoraSalario {
	public static void main(String[] args) {
		
		double salario = 1800;
		
		if (salario<=1751.81) {
			salario = salario - salario*8/100;
		} else if (salario>=1751.82 && salario<=2919.72 ) {
			salario = salario - salario*9/100;
		} else if (salario >= 2919.73 && salario <= 5839.45) {
			salario = salario - salario*10/100;
		} else {
			salario = salario - salario * 11/100;
		}
		System.out.println("Salário com desconto do INSS: "+ salario);
	}
}
