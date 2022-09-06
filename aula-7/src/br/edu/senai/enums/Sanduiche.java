package br.edu.senai.enums;

public enum Sanduiche {
	HAMBURGUER("Hamburguer", 20.), 
	MISTO("Misto Quente", 8.), 
	HOTDOG("Cachorro Quente", 12.);

	private String tipoSanduiche;
	private Double valor;

	

	private Sanduiche(String tipoSanduiche, Double valor) {
		this.tipoSanduiche = tipoSanduiche;
		this.valor = valor;
	}

	public String getTipoSanduiche() {
		return tipoSanduiche;
	}

	public Double getValor() {
		return valor;
	}
	
	public String toString() {
		return "Tipo:" + tipoSanduiche + "valor" +valor;
	}

}
