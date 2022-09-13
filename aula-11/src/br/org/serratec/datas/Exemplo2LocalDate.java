package br.org.serratec.datas;
//isso é bem legal :)
import java.time.LocalDate;
import java.time.Period;

public class Exemplo2LocalDate {

	public static void main(String[] args) {
		LocalDate dataNascimento = LocalDate.of(1997, 6, 11);
		LocalDate dataAtual = LocalDate.now();
		
		Period period = Period.between(dataNascimento, dataAtual);
		System.out.println("Sua idade é: "+ period.getYears()+" anos");
		System.out.println("Sua idade é: "+ period.getMonths()+" meses");

	}

}
