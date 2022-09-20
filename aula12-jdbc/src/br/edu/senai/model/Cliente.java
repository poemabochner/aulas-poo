package br.edu.senai.model;

public class Cliente {
	private Integer codigo;
	private String nome;
	private String telefone;
	private String email;
	public Cliente(Integer codigo, String nome, String telefone, String email) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email + "]";
	}
	public Integer getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getEmail() {
		return email;
	}
	
	
}
