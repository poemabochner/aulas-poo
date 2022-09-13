package teste;

import model.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario("Adriano", 3000.);
		System.out.println("Nome: "+funcionario1.getNome()+ "\nSalário: "+funcionario1.getSalario());
		
		System.out.println("INSS: "+funcionario1.calcularINSS());
		System.out.println("Vale Transporte: "+funcionario1.calcularValeTransporte());
		System.out.println("Salário Líquido: "+funcionario1.salarioLiquido());
		
		
		
		
		
		//;
		//;
		
	}

}
