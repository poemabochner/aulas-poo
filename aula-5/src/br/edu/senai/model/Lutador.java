package br.edu.senai.model;

public class Lutador {
	private String nome;
	private Double peso;
	private Integer idade;
	private Categoria categoria;
	public Lutador(String nome, Double peso, Integer idade, Categoria categoria) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.idade = idade;
		this.categoria = categoria;
	}
	public String getNome() {
		return nome;
	}
	public Double getPeso() {
		return peso;
	}
	public Integer getIdade() {
		return idade;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	
	
}
