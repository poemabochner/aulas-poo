package br.edu.senai.teste;

import br.edu.senai.control.ControlePagamento;
import br.edu.senai.model.Anestesista;
import br.edu.senai.model.Clinica;
import br.edu.senai.model.Medico;

public class TestePlano {

	public static void main(String[] args) {
		//double total=0;
		Clinica clinica = new Clinica("Amil","Checkup","2343899890");
		Medico medico = new Medico("Golden Cross", 1233, "Antônio Carlos");
		Anestesista anestesista = new Anestesista("Amil", 134, "Silvana", "Geral");
		ControlePagamento cp = new ControlePagamento();
		
		clinica.calcularPagamento();
		cp.calcularTotalPago(clinica);
		
		medico.calcularPagamento();
		cp.calcularTotalPago(medico);
		
		anestesista.calcularPagamento();
		cp.calcularTotalPago(anestesista);
		
		//total = clinica.calcularPagamento()+medico.calcularPagamento()+anestesista.calcularPagamento()
		
		System.out.println(clinica + " Valor a receber do Plano: " + clinica.getValorPago());
		System.out.println(medico + " Valor a receber do Plano: " + medico.getValorPago());
		System.out.println(anestesista + " Valor a receber do Plano: " + anestesista.getValorPago());
		System.out.println("Total geral pago pelos planos: "+ cp.getTotalGeral());
	}
	
}
