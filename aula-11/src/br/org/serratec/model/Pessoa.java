package br.org.serratec.model;


public class Pessoa implements Comparable<Pessoa>{
	private String nome;
	private String email;
	private Integer idade;
	public Pessoa(String nome, String email, Integer idade) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public Integer getIdade() {
		return idade;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", email=" + email + ", idade=" + idade + "]";
	}
	@Override
	public int compareTo(Pessoa o) {
		return idade-o.getIdade();
	}
	
	

}
