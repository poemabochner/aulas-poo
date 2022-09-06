package br.edu.senai.teste;

import br.edu.senai.enums.PeriodoCurso;
import br.edu.senai.model.Curso;

public class TesteCurso {

	public static void main(String[] args) {
		Curso c = new Curso("Java", PeriodoCurso.INTEGRAL);
		
		System.out.println("Nome do curso: "+ c.getNome());
		System.out.println("Dia do curso: " + PeriodoCurso.INTEGRAL.getDiaDaSemana());
	}

}
