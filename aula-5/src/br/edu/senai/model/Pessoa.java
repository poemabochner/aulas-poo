package br.edu.senai.model;

public class Pessoa {
	private String nome;
	private String email;
	public Pessoa(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	
}
