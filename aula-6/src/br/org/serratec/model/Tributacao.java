package br.org.serratec.model;
//uma interface pode herdar de outras!!
public interface Tributacao extends Taxas, ImpostoDeRenda {
	
	public Double calcularICMS();
	
	
}
