package teste;

import model.Medico;

public class TesteMedico {
	public static void main(String[] args) {
		
		Medico medico1 = new Medico("12345", "Ana Maria", 0., 250.);
		Medico medico2 = new Medico("456789", "Antonio", 0., 300.);
		
		medico1.pagamentoDinheiro(250);
		medico2.pagamentoPlano(300);
		
		System.out.println("Nome: "+medico1.getNome()+"\nSalario: "+ medico1.getSalario());
		System.out.println("\n\nNome: "+medico2.getNome()+"\nSalario: "+ medico2.getSalario());
		System.out.println("\nTotal de médicos: "+ Medico.getContador());
	}
}
