package br.org.serratec.model;

public abstract class Auxiliar extends Empregado {
	protected String categoria;

	public Auxiliar(String cpf, String nome, Double salario, String categoria) {
		super(cpf, nome, salario);
		this.categoria = categoria;
	}
	
	
	

}
