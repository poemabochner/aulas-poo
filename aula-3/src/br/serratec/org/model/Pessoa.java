package br.serratec.org.model;

public class Pessoa {
	private Integer codigo;
	private String nome;
	private Double peso;
	private Double altura;

	// a partir de agora sempre será private
	// Loombok
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double calcularIMC() {
		Double imc = peso/(altura*altura);
		return imc;
	}
	private String resultadoIMC() {
		//encapsulado
		if (calcularIMC()<18.5) {
			return "Abaixo do Peso";
		} 
		//só fazer as outras condições do IMC
	}
}
