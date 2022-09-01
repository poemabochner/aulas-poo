package br.serratec.org.model;

public class Veiculo {
	public String placa;
	public String tipoCombustivel;
	public Double valor;
	
	public Double calcularIPVA() {
		if (tipoCombustivel.equals("Flex")) {
			//comparação de String
				return valor * 0.03;
		}else {
			return valor * 0.04;}
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
}	//this:

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		if (valor<0) {
			this.valor = 0;
		} else {
		this.valor = valor;}
	}

	public String getPlaca() {
		return placa;
	}

}