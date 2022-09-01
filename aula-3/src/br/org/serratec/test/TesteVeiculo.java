package br.org.serratec.test;

import br.serratec.org.model.Veiculo;

public class TesteVeiculo {
//precisa estar como public
	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo();
		veiculo.setPlaca("ABC-1234") ;
		veiculo.setTipoCombustivel("Flex");
		veiculo.setValor(40000.);
		//fazer esse tipo de atribuição com "." não é muito legal
		System.out.println("O valor do IPVA é: " +veiculo.calcularIPVA());
	}

}
