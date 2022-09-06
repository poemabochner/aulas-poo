package br.edu.senai.exercicio;

import java.time.LocalDate;

public class Cachorro extends Mamifero implements AnimalDomestico {
	private Boolean castrado;
	
	

	public Cachorro(String nome, LocalDate dataVacinacao, String raca, Boolean castrado) {
		super(nome, dataVacinacao, raca);
		this.castrado = castrado;
	}
	
	

	public Boolean getCastrado() {
		return castrado;
	}



	@Override
	public Boolean levarVeterinario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean alimentar() {
		// TODO Auto-generated method stub
		return null;
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

}
