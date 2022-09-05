package br.org.serratec.model;

public class AtletaAmador extends Maratona {
	private Boolean atestado;

	public AtletaAmador(String nome, String sexo, Integer idade, Double altura, Boolean atestado) {
		super(nome, sexo, idade, altura);
		this.atestado = atestado;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if (atestado == true) {
			return super.toString()+"\nAtestado: " + "sim"; //ternário: return super.toString() + "\nAtestado " + (atestado ? "sim":"não")
		}else {
			return super.toString()+"\nAtestado: " + "não";
		}
		
	}

	public Boolean getAtestado() {
		return atestado;
	}
	
	
	
}
