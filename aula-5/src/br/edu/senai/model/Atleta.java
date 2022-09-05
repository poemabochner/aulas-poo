package br.edu.senai.model;

public class Atleta {
	private String nomeAtleta;
	private String posicao;

	public Atleta(String nomeAtleta, String posicao) {
		super();
		this.nomeAtleta = nomeAtleta;
		this.posicao = posicao;
	}

	public String getNomeAtleta() {
		return nomeAtleta;
	}

	public String getPosicao() {
		return posicao;
	}

}
