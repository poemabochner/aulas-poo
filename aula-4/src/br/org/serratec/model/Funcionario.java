package br.org.serratec.model;

public class Funcionario {
	private String nome;
	private String cpf;
	private Double salario;
	
	public Funcionario(String nome, String cpf, Double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	public Double getSalario() {
		return salario;
	}
	
	public Double aumentarSalario() {
		return salario *= 1.10;
	}
}
