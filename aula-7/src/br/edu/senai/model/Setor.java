package br.edu.senai.model;

public class Setor {
	private Integer numero;
	private String descricao;

	public Setor(Integer numero, String descricao) {
		super();
		this.numero = numero;
		this.descricao = descricao;
	}
	
	

	@Override
	public String toString() {
		return "Setor [numero=" + numero + ", descricao=" + descricao + "]";
	}



	public Integer getNumero() {
		return numero;
	}

	public String getDescricao() {
		return descricao;
	}

}
