package br.serratec.org.model;

public class Produto {
	private Integer codigo;
	private String descricao;
	private Double valor;
	private static int totalProdutos;
	
	public Produto(Integer codigo, String descricao, Double valor) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		totalProdutos ++;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public Double getValor() {
		return valor;
	}

	public static int getTotalProdutos() {
		return totalProdutos;
	}

	
}
