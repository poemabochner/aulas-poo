package br.org.serratec.model;

public class Caminhao extends Veiculo {
	private Integer cargaMaxima;

	public Caminhao(String chassi, String placa, String cor, Double valor, Integer cargaMaxima) {
		super(chassi, placa, cor, valor);
		this.cargaMaxima = cargaMaxima;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n" + cargaMaxima;
	}

	public Integer getCargaMaxima() {
		return cargaMaxima;
	}
	
	//Sobrescrita - pegar o método da classe mãe e sobrescrever ele:
	//@Override
	public void calcularIPVA() {
		// TODO Auto-generated method stub
		valorIPVA = valor*0.08;
	}
	
}
