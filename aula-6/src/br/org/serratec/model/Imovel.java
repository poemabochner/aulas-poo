package br.org.serratec.model;

public class Imovel {
	protected String local;
	protected Double valor;
	protected Proprietario proprietario;
	
	public Imovel(String local, Double valor) {
		super();
		this.local = local;
		this.valor = valor;
	}
	
	
	
	@Override
	public String toString() {
		return "Local: " + local + " Valor: " + valor;
	}



	public String getLocal() {
		return local;
	}
	public Double getValor() {
		return valor;
	}



	public Proprietario getProprietario() {
		return proprietario;
	}



	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	
	
	//Calcular o itbi sobre 3.5% do valor da venda
	
	public Double calcularITBI() {
		return valor;
	}
}
