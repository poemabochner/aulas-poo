package br.org.serratec.model;

public class Apartamento extends Imovel {
	private Integer andar;

	public Apartamento(String local, Double valor, Integer andar) {
		super(local, valor);
		this.andar = andar;
	}

	@Override
	public String toString() {
		return super.toString() + "Andar: " + andar;
	}

	public Integer getAndar() {
		return andar;
	}

}
