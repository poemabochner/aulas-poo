package br.edu.senai.enums;

public enum Bebida {
	REFRIGERANTE("refrigerante", 6.0), AGUA("água", 2.5), SUCO("suco", 7.0), 
	CERVEJA("crveja", 8.);
	
	private String tipo;
	private Double valor;
	private Bebida(String tipo, Double valor) {
		this.tipo = tipo;
		this.valor = valor;
	}
	public String getTipo() {
		return tipo;
	}
	public Double getValor() {
		return valor;
	}
	
	@Override
	public String toString() {
		return "Tipo:" + tipo + "valor" +valor; 
	}
}
