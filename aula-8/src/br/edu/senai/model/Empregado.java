package br.edu.senai.model;

public class Empregado {
	private String nome;
	private String telefone;

	public Empregado(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}
	
	

	@Override
	public String toString() {
		return "Nome: " + nome + ", telefone: " + telefone;
	}



	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

}
