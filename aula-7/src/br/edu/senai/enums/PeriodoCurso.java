package br.edu.senai.enums;
//enum não pode ter instância

public enum PeriodoCurso {
	TARDE("Terça e Quinta", 40, 2500.), NOTURNO("Segunda e Quarta", 20, 1000.), INTEGRAL("Sexta", 80, 3200.);

//um construtor no enum é privado
//serve para organizar a ordem de inserção dos campos

	private String diaDaSemana;
	private Integer cargaHoraria;
	private Double valor;

	private PeriodoCurso(String diaDaSemana, Integer cargaHoraria, Double valor) {
		this.diaDaSemana = diaDaSemana;
		this.cargaHoraria = cargaHoraria;
		this.valor = valor;
	}

	public String getDiaDaSemana() {
		return diaDaSemana;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public Double getValor() {
		return valor;
	}

}
