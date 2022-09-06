package br.edu.senai.model;

import br.edu.senai.enums.EstadoCivil;

public class Pessoa {
	private String nome;
	private String telefone;
	private EstadoCivil estadoCivil;
	private Setor setor;
	

	public Pessoa(String nome, String telefone, EstadoCivil estadoCivil, Setor setor) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.estadoCivil = estadoCivil;
		this.setor = setor;
	}
	
	

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", telefone=" + telefone + ", estadoCivil=" + estadoCivil + "]";
	}



	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}



	public Setor getSetor() {
		return setor;
	}
	

}
