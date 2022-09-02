package br.org.serratec.test;

import br.serratec.org.model.Medico;

public class TesteMedico {
	public static void main(String[] args) {
		
	
	Medico medico1 = new Medico(123, "Luiza", 9000., 300.);
	Medico medico2 = new Medico(321, "Bia", 9000., 300.);
	
	medico1.pagamentoDinheiro();
	medico2.pagamentoPlanoDeSaude();
	
	System.out.println("Total Geral de Médicos: "+Medico.getContador());
	
}
}