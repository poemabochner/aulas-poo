package br.org.serratec.teste;

import br.org.serratec.model.Apartamento;
import br.org.serratec.model.Casa;
import br.org.serratec.model.Proprietario;

public class TesteImovelAula6 {

	public static void main(String[] args) {
		Proprietario proprietario = new Proprietario("Poema");
		Proprietario proprietario2 = new Proprietario("Fernanda");
		Casa casa = new Casa("Centro", 893479479.50, true);
		Apartamento apto = new Apartamento("Centro", 4577593., 5);
		
		casa.setProprietario(proprietario);
		apto.setProprietario(proprietario2);
		
		System.out.println("Dados do imóvel:" + casa + casa.getProprietario().getNome());
	}

}
