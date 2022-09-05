package br.edu.senai.model;

import java.util.Arrays;

public class Contato {
	private String nome;
	private Telefone telefones[];
	private Endereco endereco;
	
	public Contato(String nome, Endereco endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}
	
	
	
	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", telefones=" + Arrays.toString(telefones) + ", endereco=" + endereco + "]";
	}



	public Telefone[] getTelefones() {
		return telefones;
	}
	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}
	public String getNome() {
		return nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	
	
	public void mostrarTelefone() {
		
	}
	
}
