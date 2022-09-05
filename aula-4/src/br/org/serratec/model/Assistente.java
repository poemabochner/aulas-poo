package br.org.serratec.model;

public class Assistente extends Funcionario {
	private String categoria;

	public Assistente(String cpf, String nome, Double salario, String categoria){
		super(cpf, nome, salario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}
}
