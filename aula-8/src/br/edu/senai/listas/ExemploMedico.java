package br.edu.senai.listas;

import java.util.ArrayList;
import java.util.List;

public class ExemploMedico {

	public static void main(String[] args) {
		
		List<Medico> medicos = new ArrayList<>();
		Double maior = 0.0;
		
		medicos.add(new Medico("123", "João", 200.));
		medicos.add(new Medico("222", "Joãoo", 300.));
		medicos.add(new Medico("1233", "João3", 200.));
		medicos.add(new Medico("1243", "Joãop", 100.));
		
		for (Medico medico : medicos) {
			if (medico.getValorConsulta()>maior) {
				maior = medico.getValorConsulta();
			}
			System.out.println(medico);
		}
		System.out.println("O maior valor é: "+ maior);
	}

}
