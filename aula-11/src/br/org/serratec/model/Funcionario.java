package br.org.serratec.model;

public class Funcionario {
	private String nome;
	private String email;
	private Double valor;
	public Funcionario(String nome, String email, Double valor) {
		super();
		this.nome = nome;
		this.email = email;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public Double getValor() {
		return valor;
	}
	@Override
	public String toString() {
		return nome;
	}
	
	
}
