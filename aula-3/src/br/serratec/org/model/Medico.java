package br.serratec.org.model;

public class Medico {
	private Integer crm;
	private String nome;
	private Double salario;
	private Double valorConsulta;
	private static int contador;
	
	public Medico(Integer crm, String nome, Double salario, Double valorConsulta) {
		super();
		this.crm = crm;
		this.nome = nome;
		this.salario = salario;
		this.valorConsulta = valorConsulta;
		contador++;
	}

	public Integer getCrm() {
		return crm;
	}

	public String getNome() {
		return nome;
	}

	public Double getSalario() {
		return salario;
	}

	public Double getValorConsulta() {
		return valorConsulta;
	}
	public static int getContador() {
		return contador;
	}
	public void pagamentoDinheiro() {
		salario += valorConsulta;
	}
	public void pagamentoPlanoDeSaude() {
		salario = salario + valorConsulta * 0.70;
	}

	

	
	
}
