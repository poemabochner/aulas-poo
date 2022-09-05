package br.org.serratec.model;

public class Diretor extends Empregado {
	private String categoria;
	

	public Diretor(String cpf, String nome, Double salario, String categoria) {
		super(cpf, nome, salario);
		this.categoria = categoria;
	}
	
	

	@Override
	public String toString() {
		return super.toString()+" Categoria: "+categoria;
	}

	public String getCategoria() {
		return categoria;
	}
	
	@Override
	public void aumentarSalario() {
		salario = salario * 1.15;
	}

}
