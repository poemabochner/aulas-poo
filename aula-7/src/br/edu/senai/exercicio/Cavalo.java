package br.edu.senai.exercicio;

import java.time.LocalDate;

public abstract class Cavalo extends Mamifero implements AnimalCompeticao {
	private String marcaFerradura;

	public String getMarcaFerradura() {
		return marcaFerradura;
	}

	public Cavalo(String nome, LocalDate dataVacinacao, String raca, String marcaFerradura) {
		super(nome, dataVacinacao, raca);
		this.marcaFerradura = marcaFerradura;
	}

	@Override
	public void amamentar() {
		// TODO Auto-generated method stub

	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void trocarFerradura(){
		
	}
	
public void viajar() {
	
}
}
