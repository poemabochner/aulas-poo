package br.edu.senai.model;

public class Cidade {
	private String nomeCidade;
	private Estado estado;
	
	public Cidade(String nomeCidade, Estado estado) {
		super();
		this.nomeCidade = nomeCidade;
		this.estado = estado;
	}
	
	
	
	@Override
	public String toString() {
		return "Cidade [nomeCidade=" + nomeCidade + ", estado=" + estado + "]";
	}



	public String getNomeCidade() {
		return nomeCidade;
	}
	public Estado getEstado() {
		return estado;
	}
	
	
}
