package br.serratec.org.model;

public class Pessoa {
	private Integer codigo;
	private String nome;
	private Double peso;
	private Double altura;

	//construtor padrão (default) - vazio
	//um construtor não tem retorno,
	//mas pode ter argumentos
	//um construtor não é um método
	public Pessoa() {
		// TODO Auto-generated constructor stub
		System.out.println("Novo objeto criado!");
	}
	
	// a partir de agora sempre será private
	// Loombok
	
	//construtor cheio
	public Pessoa(Integer codigo, String nome, Double peso, Double altura) {
		super();
		this.codigo=codigo;
		this.nome=nome;
		this.peso=peso;
		this.altura=altura;
	}
	
	
	
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
	public String resultadoIMC() {
		//encapsulado
		if (calcularIMC()<18.5) {
			return "Abaixo do Peso";
		} else if (calcularIMC()<24.9) {
			return "Peso Ideal";
		}else {
			return "Acima do Peso";
		}
	}
}
