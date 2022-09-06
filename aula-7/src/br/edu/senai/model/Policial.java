package br.edu.senai.model;
//public final class Policial:
//essa classe não poderá ter filhos
//imutável
//quando colocar o final no método, estamos proibindo a sobrescrita (override)

public class Policial {
	private String nome;
	private String matricula;
	
	
	public Policial(String nome, String matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}
	
	
	
	@Override
	public String toString() {
		return "Policial [nome=" + nome + ", matricula=" + matricula + "]";
	}



	public String getNome() {
		return nome;
	}
	public String getMatricula() {
		return matricula;
	}
	
	
}
