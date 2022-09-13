package br.org.serratec.horas;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class ExemploHora {
	public static void main(String[] args) {
		
		LocalTime hora = LocalTime.of(22, 05);
		LocalTime horaAtual = LocalTime.now();
		
		System.out.println(hora.plusHours(2));
		System.out.println(hora.plusMinutes(30));
		
		LocalDateTime dataHora = LocalDateTime.now();
		System.out.println(dataHora);
	}
}
