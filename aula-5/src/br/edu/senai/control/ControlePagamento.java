package br.edu.senai.control;

import br.edu.senai.model.PlanoDeSaude;

public class ControlePagamento {
	private Double totalGeral=0.0;

	public Double getTotalGeral() {
		return totalGeral;
	}

	public void setTotalGeral(Double totalGeral) {
		this.totalGeral = totalGeral;
	}
	
	public void calcularTotalPago(PlanoDeSaude plano) {
		totalGeral = totalGeral + plano.getValorPago();
	}
}
