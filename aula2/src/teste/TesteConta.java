package teste;

import model.Conta;

public class TesteConta {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.numeroConta = 1234;
		conta1.titular="Ana Maria";
		conta1.saldo=1000;
		
		//Conta conta2 = new Conta();
		// valores seguindo o padrão anterior
		
		
		//depósito de 500; saque de 200; imprimir saldo
		conta1.deposito(500);
		if(conta1.saque(200)) {
			System.out.println("saque efetuado com sucesso");
		}else {
			System.out.println("não tem dinheiro suficiente");
		}
		
		System.out.println("saldo: "+conta1.saldo);
	}
}
