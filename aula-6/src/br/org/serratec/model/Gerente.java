package br.org.serratec.model;

public class Gerente extends Empregado {
	private String nivel;
	
	

	public Gerente(String cpf, String nome, Double salario, String nivel) {
		super(cpf, nome, salario);
		this.nivel = nivel;
	}




	@Override
	public String toString() {
		return super.toString()+" Nível: "+ nivel;
	}

	public String getNivel() {
		return nivel;
	}

	@Override
	public void aumentarSalario() {
	}

}
