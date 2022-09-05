package br.org.serratec.model;

public class VeiculoPasseio extends Veiculo {
	private Integer quantidadedePortas;

	public VeiculoPasseio(String chassi, String placa, String cor, Double valor, Integer quantidadedePortas) {
		super(chassi, placa, cor, valor);
		this.quantidadedePortas = quantidadedePortas;
	}

	public Integer getQuantidadedePortas() {
		return quantidadedePortas;
	}
	
	
}
