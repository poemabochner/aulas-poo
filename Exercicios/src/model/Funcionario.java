package model;

public class Funcionario {
	private String nome;
	private Double salario;
	

	
	public Funcionario(String nome, Double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
		//this.valorINSS = valorINSS;
		//this.valorTransporte = valorTransporte;
		//this.salarioLiquido = salarioLiquido;
	}

	public String getNome() {
		return nome;
	}

	public Double getSalario() {
		return salario;
	}

	public double calcularINSS() {
		return salario * 0.11;
	}
	
	public double calcularValeTransporte() {
		return salario * 0.06;
	}
	
	public double salarioLiquido() {
		return salario - (salario * 0.11 + salario * 0.06);
	}
}

