package br.org.serratec.datas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ExemploLocalDate {

	public static void main(String[] args) {
		LocalDate dataAtual = LocalDate.now();
		LocalDate dataDeEntrada = LocalDate.of(2022, 9, 12);
		System.out.println(dataAtual);
		System.out.println(dataDeEntrada);
		LocalDate dataConvertida = LocalDate.parse("2022-09-12");//usar no trabalho final
		
		System.out.println("após 3 dias: "+dataAtual.plusDays(3));
		System.out.println("menos 20 dias: "+ dataAtual.minusDays(20));
		System.out.println("3 meses atrás: "+ dataAtual.minus(3,ChronoUnit.MONTHS));
	}

}
