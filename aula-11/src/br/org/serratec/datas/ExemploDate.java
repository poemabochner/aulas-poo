package br.org.serratec.datas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploDate {
	public static void main(String[] args) {
		Date dataAtual = new Date();
		System.out.println(dataAtual);
		System.out.println("Dia de hoje: "+dataAtual.getDate());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String dataFormatada = sdf.format(dataAtual);
		System.out.println(dataFormatada);
	}
}
