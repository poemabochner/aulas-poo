package br.org.serratec.model;

public class AtletaProsfissional extends Maratona {
	private Double peso;

	public AtletaProsfissional(String nome, String sexo, Integer idade, Double altura, Double peso) {
		super(nome, sexo, idade, altura);
		this.peso = peso;
	}

	public Double getPeso() {
		return peso;
	}
	
	
}
