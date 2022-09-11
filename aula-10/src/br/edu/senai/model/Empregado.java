package br.edu.senai.model;

public class Empregado {
	private String cpf;
	private String nome;
	public Empregado(String cpf, String nome) {
		super();
		this.cpf = cpf;
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	@Override
	public String toString() {
		return "cpf: " + cpf + " nome: " + nome + "\n";
	}
	
	
}
