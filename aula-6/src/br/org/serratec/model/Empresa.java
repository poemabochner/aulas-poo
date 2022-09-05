package br.org.serratec.model;

public class Empresa implements Tributacao {
	
	private String razaoSocial;
	private Double rendimentos;
	
	

	public Empresa(String razaoSocial, Double rendimentos) {
		super();
		this.razaoSocial = razaoSocial;
		this.rendimentos = rendimentos;
	}

	
	@Override
	public String toString() {
		return "Empresa [razaoSocial=" + razaoSocial + ", rendimentos=" + rendimentos + "]";
	}



	public String getRazaoSocial() {
		return razaoSocial;
	}



	public Double getRendimentos() {
		return rendimentos;
	}



	@Override
	public Double calcularImpostoDeRenda() {
		return rendimentos * impostoDeRendaPJ;
	}

	@Override
	public Double calcularICMS() {
		return rendimentos * icms;
	}

}
