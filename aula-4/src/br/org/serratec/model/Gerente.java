package br.org.serratec.model;

//herança entre as classes

public class Gerente extends Funcionario {
	private String tipo;

	public Gerente(String nome, String cpf, Double salario, String tipo) {
		super(nome, cpf, salario);
		this.tipo = tipo; //aproveita os atributos de outra classe
	}

	public String getTipo() {
		return tipo;
	}
	
	
}
