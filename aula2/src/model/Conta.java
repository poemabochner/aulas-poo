package model;

public class Conta {
	
	public int numeroConta;
	public String titular;
	public double saldo;
	
	//não tem retorno
	public void deposito (double valor) {
		saldo = saldo + valor;
		//saldo += valor (mesma coisa que o de cima)
	}
	public boolean saque(double valor) {
		if (saldo<valor) {
			return false;
		}else {
			saldo+=valor;
			return true;
		}
	}
}
