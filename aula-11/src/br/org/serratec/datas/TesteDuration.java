package br.org.serratec.datas;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TesteDuration {

	public static void main(String[] args) {
		LocalDateTime primeiroPeriodo = LocalDateTime.of(2022, 9, 12, 20, 30);
		LocalDateTime segundoPeriodo = LocalDateTime.of(2022, 9, 25, 22, 00);
		
		Duration duration = Duration.between(primeiroPeriodo, segundoPeriodo);
		Long dias = duration.toDays();
		System.out.println(dias);
		
		Duration duration2 = duration.minus(2, ChronoUnit.DAYS);
		System.out.println(duration2.toHours());
	}

}
