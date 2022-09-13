package model;
//criar uma classe com o nome médico
//atributos: crm, noe, salario e valor da consulta
//métodos: pagamentoDinheiro, pagamentoPlano (o médico recebe 70% do valor)
//construir dois objetos em uma outra classe com o nome TesteMedico
//crie um construtor vazio e outro com todos os dados da conta na classe Medico.
//passe os dados na construção dos objetos
public class Medico {
	
	private String crm;
	private String nome;
	private Double salario;
	private Double valorConsulta;
	private static int contador;
	
	public Medico(String crm, String nome, Double salario, Double valorConsulta) {
		super();
		this.crm = crm;
		this.nome = nome;
		this.salario = salario;
		this.valorConsulta = valorConsulta;
		contador++;
	}

	public String getCrm() {
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

	public static void setContador(int contador) {
		Medico.contador = contador;
	}

	public void pagamentoDinheiro(double valorConsulta) {
		salario += valorConsulta;
	}
	
	public void pagamentoPlano(double valorConsulta) {
		salario  += valorConsulta * 0.7;
	}
}
