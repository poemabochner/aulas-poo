package br.edu.senai.model;

public class Anestesista extends Medico {
	private String tipoAnestesia;

	public Anestesista(String empresa, Integer crm, String nome,
			String tipoAnestesia) {
		super(empresa, crm, nome);
		this.tipoAnestesia = tipoAnestesia;
	}
	
	@Override
	public String toString() {
		return super.toString()+ " Anestesista [tipoAnestesia=" + tipoAnestesia + "]";
	}

	public String getTipoAnestesia() {
		return tipoAnestesia;
	}
	
	@Override
	public Double calcularPagamento() {
		return valorPago = super.calcularPagamento()+1000;
	}
	
}
