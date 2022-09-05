package br.edu.senai.model;

public class Telefone {
	private String numero;

	public Telefone(String numero) {
		super();
		this.numero = numero;
	}
	
	

	@Override
	public String toString() {
		return "Telefone [numero=" + numero + "]";
	}



	public String getNumero() {
		return numero;
	}
	
	
}
